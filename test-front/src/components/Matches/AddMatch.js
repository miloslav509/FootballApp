import React from "react";
import AppAxios from "../../api/AppAxios";
import { Col, Form, Button } from "react-bootstrap";

class AddMatch extends React.Component {

    constructor(props) {
        super(props);
        let match = {
            dateTime: '',
            hostId: -1,
            guestId: -1,
            refId: -1,
            week: 1
        }

        this.state = {
            match: match,
            clubs: [],
            refs: [],
        };

    }

    componentDidMount() {
        this.getClubs();
        this.getRefs();
    }

    async getClubs() {

        try {
            let result = await AppAxios.get("/klubovi");
            this.setState({ clubs: result.data });
            console.log(this.state);
        } catch (error) {
            console.log(error);
            alert("Couldn't fetch clubs");
        }
    }

    async getRefs() {

        try {
            let result = await AppAxios.get("/sudije");
            this.setState({ refs: result.data });
            console.log(this.state);
        } catch (error) {
            console.log(error);
            alert("Couldn't fetch refs");
        }
    }

    create(e) {
        e.preventDefault();
        let match = this.state.match;
        let utakmicaDTO = {
            datumVreme: match.dateTime,
            domacinId: match.hostId,
            gostId: match.guestId,
            sudijaId: match.refId,
            kolo: match.week,
            takmicenjeId: 1,
            stadionId: match.hostId
        }
        let response = AppAxios.post("/utakmice", utakmicaDTO)
            .then((res) => {
                console.log(res);
                alert("Match was added succesfully");
                this.props.history.push("/");
            })
            .catch((error) => {
                console.log(error);
                alert("Error occured please try again!");
            }) 
    }

    valueInputChange(event) {
        let name = event.target.name;
        let value = event.target.value;

        let match = this.state.match;
        match[name] = value;
        this.setState({match: match});
        console.log(this.state)
    }

    render() {
        return (
            <div>
                <Col></Col>
                <Col xs="12" sm="10" md="8">
                    <h1>Add Match</h1>
                    <Form>
                        <Form.Group>
                            <Form.Label htmlFor="time">Time</Form.Label>
                            <Form.Control id="dateTime" name="dateTime" value={this.state.match.dateTime} onChange={(e) => this.valueInputChange(e)} /> <br />
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="week">Week</Form.Label>
                            <Form.Control id="week" name="week" value={this.state.match.week} onChange={(e) => this.valueInputChange(e)} /> <br />
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="host">Host</Form.Label>
                            <Form.Control as="select" id="hostId" name="hostId" value={this.state.match.hostId} onChange={(e) => this.valueInputChange(e)}>
                                <option></option>
                                {
                                    this.state.clubs.map((club) => {
                                        return (
                                            <option key={club.id} value={club.id}>{club.naziv}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="guest">Guest</Form.Label>
                            <Form.Control as="select" id="guestId" name="guestId" value={this.state.match.guestId} onChange={(e) => this.valueInputChange(e)}>
                                <option></option>
                                {
                                    this.state.clubs.map((club) => {
                                        return (
                                            <option key={club.id} value={club.id}>{club.naziv}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="ref">Refere</Form.Label>
                            <Form.Control as="select" id="refId" name="refId" value={this.state.match.refId} onChange={(e) => this.valueInputChange(e)}>
                                <option></option>
                                {
                                    this.state.refs.map((ref) => {
                                        return (
                                            <option key={ref.id} value={ref.id}>{ref.ime} {ref.prezime}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                            <Button style={{ marginTop: "25px" }} onClick={(e) => this.create(e)}>
                                Add
                            </Button>
                        </Form.Group>
                    </Form>
                </Col>
            </div>
        )
    }
}

export default AddMatch;