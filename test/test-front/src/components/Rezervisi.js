import React from 'react';
import { Form, Row, Col, Button, FormGroup, FormLabel, FormControl} from 'react-bootstrap';
import AppAxios from '../api/AppAxios';

class Rezervisi extends React.Component {

    constructor(props) {
        super(props);
    
        this.state = {
            festivalId: -1,
            brojKarata: 0
        };
    }

    componentDidMount(){
        this.setState({festivalId: this.props.match.params.id});
    }



    onChangeHandler(event) {
        let name = event.target.name;
        let value = event.target.value;

        let change = {};
        change[name] = value;

        this.setState(change);
        console.log(this.state);
    }

    create(){
        let params = {
            festivalId: this.state.festivalId,
            brojKarata: this.state.brojKarata
        }
        AppAxios.post('/rezervacije', params)
             .then(res => {
                 console.log(res);
                 this.props.history.push('/festivali');
                 alert('Uspesna rezervacija');
                 
             })
             .catch(error => {
                 console.log(error);
                 alert('Error occured please try again!');
             })
    }

    render() {

        return (
            <div>
                <Row>
                    <Col></Col>
                    <Col>
                        <h1>Dodaj rezervaciju</h1>
                        <Form>
                            <Form.Label htmlFor="brNarudzbine">Broj Karata</Form.Label>
                            <Form.Control type="number" id="brojKarata" name="brojKarata" onChange={(e) => this.onChangeHandler(e)}></Form.Control>
                                    
                            <Button variant="primary" onClick={() => this.create()}>Dodaj</Button>
                        </Form>
                    </Col>
                    <Col></Col>
                </Row>
            </div>
        )
    }
}

export default Rezervisi;