import React from 'react';
import {Button, ButtonGroup, Table, Form, Collapse, FormControl} from 'react-bootstrap';
import AppAxios from '../api/AppAxios';


class Festivali extends React.Component {

    constructor() {
        super();

        const search = {
            mestoId : -1,
            naziv: ""
        }
        this.state = { 
            festivali: [],
            search: search,
            pageNo: 0,
            totalPages: 1,
            open: false,
            mesta: []

        }
    }

    componentDidMount() {
        this.getFestivali(0);
        this.getMesta();
        console.log(this.state);
    }

    getFestivali(newPageNo) {
        var params = {
            'mestoId': this.state.search.mestoId,
            'naziv': this.state.search.naziv,
           
            'pageNo': newPageNo
        }
        console.log(params);
        AppAxios.get('/festivali', {params})
            .then(res => {
                console.log(res);
                console.log(res.data);
                this.setState({
                    festivali: res.data,
                    pageNo: newPageNo,
                    totalPages: res.headers['total-pages']
                });
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');
            });
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

    delete(id) {
        console.log(id);
        AppAxios.delete('/festivali/' + id)
            .then(res => {
                console.log(res);
                window.location.reload();
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');
            })
    }

    rezervisi(id){
        this.props.history.push('/festivali/rezervisi/' + id);
    }

    

    renderFestivali() {
        return this.state.festivali.map((fes, index) => {
            return (
                <tr key={fes.id}>
                    <td>{fes.naziv}</td>
                    <td>{fes.mesto}</td>
                    <td>{fes.datumPocetka}</td>
                    <td>{fes.datumZavrsetka}</td>
                    <td>{fes.cenaKarte}</td>
                    <td>{fes.brojKarata}</td>
                   
                    {window.localStorage['role']=="ROLE_ADMIN"?
                    [<td><Button variant="danger" onClick={() => this.delete(fes.id)}>Obriši</Button></td>,
                    <td><Button variant="warning" onClick={() => this.goToEdit(fes.id)}>Izmeni</Button></td>]
                    : null}
                    {window.localStorage['role']=="ROLE_ADMIN" || fes.brojKarata <= 0?
                    <td><Button variant="primary" disabled onClick={() => this.rezervisi(fes.id)}>Rezervisi</Button></td>
                    :<td><Button variant="primary" onClick={() => this.rezervisi(fes.id)}>Rezervisi</Button></td>} 
                </tr>
            )
        })
    }


    onChangeHandler(event) {
        const name = event.target.name;
        const value = event.target.value;

        let search = this.state.search;
        search[name] = value
        this.setState(search)
        console.log(this.state);
    }

    goToAdd() {
        this.props.history.push('/festivali/dodaj');
    }

    goToEdit(id) {
        this.props.history.push('/festivali/izmeni/' + id);
    }

    render() {
        const open = this.state.open;
        return (
            <div>
                <div>
                <Button 
                variant="primary"
                onClick={() => this.setState({open: !open})}
                aria-controls="formForSearch"
                aria-expanded={open}>
                    Filter
                </Button>
                <Collapse in={this.state.open}>
                    <div id="formForSearch">
                        <Form>
                            <Form.Label htmlFor="value">Naziv</Form.Label>
                            <Form.Control type="text" name="naziv" placeholder="naziv" onChange={(e) => this.onChangeHandler(e)}></Form.Control>
                            <Form.Control
                                onChange={(event) => this.onChangeHandler(event)}
                                name="mestoId"
                                value={this.state.search.mestoId}
                                as="select">
                                <option value={-1}></option>
                                {this.state.mesta.map((mesto) => {
                                    return (
                                    <option value={mesto.id} key={mesto.id}>
                                        {mesto.mestoOdrzavanja}
                                    </option>
                                    );
                                })}
                            </Form.Control>
                            <Button variant="success" onClick={() => this.getFestivali(0)}>Search</Button>
                        </Form>
                    </div>
                </Collapse>
                <div>
                    <ButtonGroup>
                        <Button disabled={this.state.pageNo===0} onClick={()=> this.getFestivali(this.state.pageNo-1)}>Prev</Button>
                        <Button disabled={this.state.pageNo===this.state.totalPages-1}  onClick={()=> this.getFestivali(this.state.pageNo+1)}>Next</Button>
                    </ButtonGroup>
                    <Table striped bordered hover>
                        <thead>
                            <tr>
                                <th>Naziv festivala</th>
                                <th>Mesto odrzavanja</th>
                                <th>Datum pocetka</th>
                                <th>Datum zavrsetka</th>
                                <th>Cena karte</th>
                                <th>Broj preostalih karata</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            {this.renderFestivali()}
                        </tbody>
                    </Table>
                    <br/>
                    {window.localStorage['role'] == "ROLE_ADMIN"?<Button variant="primary" onClick={() => this.goToAdd() }>Add new</Button>:null}
                </div>
            </div>
            </div>
        )
    }

}

export default Festivali;