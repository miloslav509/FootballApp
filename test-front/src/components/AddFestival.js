import React from 'react';
import { Form, Row, Col, Button, FormGroup, FormLabel, FormControl} from 'react-bootstrap';
import AppAxios from '../api/AppAxios';

class AddFestival extends React.Component {
    constructor() {
        super();

        this.state = {
            id: '',
            naziv: '',
            datumPocetka: '',
            datumZavrsetka: '',
            cenaKarte: 0,
            brojKarata: 0,
            mestoNaziv: '',
            mesta: []
        }
    }


    componentDidMount() {
        this.getMesta();
        
    }

    getMesta(){
        AppAxios.get('/mesta')
            .then(res => {
                console.log(res);
                console.log(res.data);
                this.setState({
                    mesta: res.data,
                    
                });
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');
            });
    }


    create() {
        console.log(this.state);
        let params = {
            brojMesta: this.state.brojMesta,
            vremePolaska: this.state.vremePolaska,
            destinacija: this.state.destinacija,
            cenaKarte: this.state.cenaKarte,
            prevoznikId: this.state.prevoznikId,
            
            opis: this.state.opis
        }

        AppAxios.post('/linije', params)
            .then(res => {
                console.log(res);
                this.props.history.push('/linije');
            })
            .catch(error => {
                console.log(error);
                alert("Error");
            })
    }


    create() {
        let params = {
            naziv: this.state.naziv,
            datumPocetka: this.state.datumPocetka,
            datumZavrsetka: this.state.datumZavrsetka,
            cenaKarte: this.state.cenaKarte,
            brojKarata: this.state.brojKarata,
            
        }
        console.log(params);

        AppAxios.post('/festivali', params)
            .then(res => {
                console.log(res);
                this.props.history.push('/festivali');
            })
            .catch(error => {
                console.log(error);
                alert("Error");
            })
    }


    onChangeHandler(event) {
        let name = event.target.name;
        let value = event.target.value;

        let change = {};
        change[name] = value;

        this.setState(change);
    }

    render() {
        return (
             <div>
                <Row>
                    <Col></Col>
                    <Col>
                        <h1>Dodaj Festival</h1>
                        <Form>
                            <Form.Label htmlFor="naziv">Naziv</Form.Label>
                            <Form.Control type="text" id="naziv" name="naziv" onChange={(e) => this.onChangeHandler(e)} ></Form.Control>
                            <Form.Label htmlFor="datumPocetka">Datum pocetka</Form.Label>
                            <Form.Control type="text" id="datumPocetka" name="datumPocetka" onChange={(e) => this.onChangeHandler(e)} ></Form.Control>
                            <Form.Label htmlFor="datumZavrsetka">Datum Zavrsetka</Form.Label>
                            <Form.Control type="text" id="datumZavrsetka" name="datumZavrsetka" onChange={(e) => this.onChangeHandler(e)} ></Form.Control>
                            <Form.Label htmlFor="cenaKarte">Cena karte</Form.Label>
                            <Form.Control type="number" id="cenaKarte" name="cenaKarte" onChange={(e) => this.onChangeHandler(e)} ></Form.Control>
                            <Form.Label htmlFor="cenaKarte">Broj karata</Form.Label>
                            <Form.Control type="number" id="brojKarata" name="brojKarata" onChange={(e) => this.onChangeHandler(e)} ></Form.Control>
                            <Form.Label htmlFor="mesto">Mesto</Form.Label>
                            <FormControl as="select" id="mestoId" name="mestoId" onChange={(e) => this.onChangeHandler(e)}>
                                    <option></option>
                                    {
                                        this.state.mesta.map((mes) => {
                                            return (
                                                <option key={mes.id} value={mes.id}>{mes.mestoOdrzavanja}</option>
                                            )
                                        })
                                    }
                                </FormControl>
                            <Button variant="primary" onClick={() => this.create()}>Dodaj</Button>
                        </Form>
                    </Col>
                    <Col></Col>
                </Row>
            </div>
        )
    }
}

export default AddFestival;