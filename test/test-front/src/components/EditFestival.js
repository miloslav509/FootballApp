import React from 'react';
import { Form, Row, Col, Button, FormGroup, FormLabel, FormControl} from 'react-bootstrap';
import AppAxios from '../api/AppAxios';


class EditFestival extends React.Component {

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
            mesta: [],
            mestoId: -1
        }
    }

    componentDidMount() {
        this.getMesta();
        this.setState({id: this.props.match.params.id});
        this.getFestivalById(this.props.match.params.id);
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

    getFestivalById(id) {
        AppAxios.get('/festivali/' + id)
            .then(res => {
                console.log(res)
                this.setState({
                    naziv: res.data.naziv,
                    datumPocetka: res.data.datumPocetka,
                    datumZavrsetka: res.data.datumZavrsetka,
                    cenaKarte: res.data.cenaKarte,
                    mestoId: res.data.mestoId,
                    mestoNaziv: res.data.mestoNaziv,
                    brojKarata: res.data.brojKarata
                })
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');
            })
    }

    edit() {
        let params = {
            'id': this.state.id,
            'naziv': this.state.naziv,
            'datumPocetka': this.state.datumPocetka,
            'datumZavrsetka': this.state.datumZavrsetka,
            'cenaKarte': this.state.cenaKarte,
            'mestoId': this.state.mestoId,
            'brojKarata': this.state.brojKarata
        };

        AppAxios.put('/festivali/' + this.props.match.params.id, params)
            .then(res => {
                console.log(res);
                this.props.history.push('/festivali');
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');

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
                        <h1>Izmeni Festival</h1>
                        <Form>
                            <Form.Label htmlFor="naziv">Naziv</Form.Label>
                            <Form.Control type="text" id="naziv" name="naziv" onChange={(e) => this.onChangeHandler(e)} value={this.state.naziv}></Form.Control>
                            <Form.Label htmlFor="datumPocetka">Datum pocetka</Form.Label>
                            <Form.Control type="text" id="datumPocetka" name="datumPocetka" onChange={(e) => this.onChangeHandler(e)} value={this.state.datumPocetka}></Form.Control>
                            <Form.Label htmlFor="datumZavrsetka">Datum Zavrsetka</Form.Label>
                            <Form.Control type="number" id="datumZavrsetka" name="datumZavrsetka" onChange={(e) => this.onChangeHandler(e)} value={this.state.datumZavrsetka}></Form.Control>
                            <Form.Label htmlFor="cenaKarte">Cena karte</Form.Label>
                            <Form.Control type="number" id="cenaKarte" name="cenaKarte" onChange={(e) => this.onChangeHandler(e)} value={this.state.cenaKarte}></Form.Control>
                            <Form.Label htmlFor="cenaKarte">Broj karata</Form.Label>
                            <Form.Control type="number" id="brojKarata" name="brojKarata" onChange={(e) => this.onChangeHandler(e)} value={this.state.brojKarata}></Form.Control>
                            <Form.Label htmlFor="mesto">Mesto</Form.Label>
                            <FormControl as="select" id="mestoId" name="mestoId" onChange={(e) => this.onChangeHandler(e)} value={this.state.mestoId}>
                                    <option></option>
                                    {
                                        this.state.mesta.map((mes) => {
                                            return (
                                                <option key={mes.id} value={mes.id}>{mes.mestoOdrzavanja}</option>
                                            )
                                        })
                                    }
                                </FormControl>
                            <Button variant="primary" onClick={() => this.edit()}>izmeni</Button>
                        </Form>
                    </Col>
                    <Col></Col>
                </Row>
            </div>
        )
    }
}

export default EditFestival;