import React from "react";
import AppAxios from "../../api/AppAxios";
import { Row, Col, Image, Form, Button } from 'react-bootstrap';

class EditMatch extends React.Component {

    constructor(props) {
        super(props);

        let hostGoal = {
            scorerId: -1,
            assistId: -1,
            minute: 0
        }

        let guestGoal = {
            scorerId: -1,
            assistId: -1,
            minute: 0
        }

        this.state = {
            id: -1,
            hostId: -1,
            hostName: '',
            guestId: -1,
            guestName: '',
            dateTime: '',
            hostGoals: -1,
            guestGoals: -1,
            goals: [],
            stadiumId: -1,
            stadiumName: '',
            hostShots: -1,
            guestShots: -1,
            hostShotsOnGoal: -1,
            guestShotsOnGoal: -1,
            hostPossesion: -1,
            guestPossesion: -1,
            videoURL: '',
            week: -1,
            hostImage: '',
            guestImage: '',
            hostPlayers: [],
            guestPlayers: [],
            hostGoal: hostGoal,
            guestGoal: guestGoal
        }
    }

    componentDidMount() {
        this.getMatch(this.props.match.params.id);
    }

    getMatch(matchId) {
        AppAxios.get('/utakmice/' + matchId)
            .then(res => {
                console.log(res);
                let match = res.data;
                this.setState({
                    dateTime: match.datumVreme,
                    hostId: match.domacinId,
                    hostName: match.domacinNaziv,
                    guestId: match.gostId,
                    guestName: match.gostNaziv,
                    hostPossesion: match.posedDomacin,
                    guestPossesion: match.posedGost,
                    hostShots: match.suteviDomacin,
                    guestShots: match.suteviGost,
                    hostShotsOnGoal: match.suteviUGolDomacin,
                    guestShotsOnGoal: match.suteviUGolGost,
                    stadiumId: match.stadionId,
                    stadiumName: match.stadionNaziv,
                    goals: match.golovi,
                    hostGoals: match.goloviDomacin,
                    guestGoals: match.goloviGost,
                    week: match.kolo,
                    videoURL: match.video,
                    id: match.id,
                    comments: match.komentari,
                    hostImage: match.domacinSlika,
                    guestImage: match.gostSlika
                })
                console.log(this.state);
                this.getHostPlayers(this.state.hostId);
                this.getGuestPlayers(this.state.guestId);
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    getHostPlayers(id) {
        AppAxios.get('/klubovi/' + id + '/igraci')
            .then(res => {
                console.log(res);

                this.setState({ hostPlayers: res.data })
                console.log(this.state);
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    getGuestPlayers(id) {
        AppAxios.get('/klubovi/' + id + '/igraci')
            .then(res => {
                console.log(res);

                this.setState({ guestPlayers: res.data })
                console.log(this.state);
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    create(e) {
        let goal = e.target.name == "hostGoal" ? this.state.hostGoal : this.state.guestGoal;
        console.log(goal);
        let golDTO = {
            strelacId: goal.scorerId,
            utakmicaId: this.state.id,
            minut: goal.minute,
            asistentId: goal.assistId
        }
        let response = AppAxios.post("/golovi", golDTO)
            .then((res) => {
                console.log(res);
                alert("Goal was added succesfully");
                window.location.reload();
            })
            .catch((error) => {
                console.log(error);
                alert("Error occured please try again!");
            }) 
    }

    valueInputChangeHostGoal(e) {
        let input = e.target;
    
        let id = input.id;
        let value = input.value;
    
        let hostGoal = this.state.hostGoal;
        hostGoal[id] = value;
    
        this.setState({ hostGoal: hostGoal });
        console.log(this.state);
    }

    valueInputChangeGuestGoal(e) {
        let input = e.target;
    
        let id = input.id;
        let value = input.value;
    
        let guestGoal = this.state.guestGoal;
        guestGoal[id] = value;
    
        this.setState({ guestGoal: guestGoal });
        console.log(this.state);
    }
    

    render() {
        return (
            <div>
                <Row>
                    <Col><h6>{this.state.week}. week</h6></Col><Col className="text-md-right"><h6>{this.state.dateTime}</h6></Col>
                </Row>
                <Row className="align-items-center displey-flex">
                    <Col></Col>
                    <Image src={this.state.hostImage} width={40} height={40} />
                    <h3 className="text-center">{this.state.hostName} {this.state.hostGoals} - {this.state.guestGoals} {this.state.guestName}</h3>
                    <Image src={this.state.guestImage} width={40} height={40} rounded />
                    <Col></Col>
                </Row>
                <Row>
                    <Col>
                        <Form.Group>
                            <Form.Label htmlFor="hostGaol">Host goal</Form.Label>
                            <Form.Control as="select" id="scorerId" name="scorerId" value={this.state.hostGoal.scorer} onChange={(e) => this.valueInputChangeHostGoal(e)}>
                                <option></option>
                                {
                                    this.state.hostPlayers.map((player) => {
                                        return (
                                            <option key={player.id} value={player.id}>{player.ime} {player.prezime}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="hostGaolAssist">Assist</Form.Label>
                            <Form.Control as="select" id="assistId" name="assistId" value={this.state.hostGoal.assist} onChange={(e) => this.valueInputChangeHostGoal(e)}>
                                <option></option>
                                {
                                    this.state.hostPlayers.map((player) => {
                                        return (
                                            <option key={player.id} value={player.id}>{player.ime} {player.prezime}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Label htmlFor="minute">Minute</Form.Label>
                        <Form.Control
                            value={this.state.hostGoal.minute}
                            id="minute"
                            type="number"
                            onChange={(e) => this.valueInputChangeHostGoal(e)}
                        />
                        <Button style={{ marginTop: "25px" }} name="hostGoal" onClick={(e) => this.create(e)}>
                                Add
                        </Button>
                    </Col>
                    <Col>
                        <Form.Group>
                            <Form.Label htmlFor="guestGaol">Guest goal</Form.Label>
                            <Form.Control as="select" id="scorerId" name="scorerId" value={this.state.guestGoal.scorer} onChange={(e) => this.valueInputChangeGuestGoal(e)}>
                                <option></option>
                                {
                                    this.state.guestPlayers.map((player) => {
                                        return (
                                            <option key={player.id} value={player.id}>{player.ime} {player.prezime}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Group>
                            <Form.Label htmlFor="guestGaolAssist">Assist</Form.Label>
                            <Form.Control as="select" id="assistId" name="assistId" value={this.state.guestGoal.assist} onChange={(e) => this.valueInputChangeGuestGoal(e)}>
                                <option></option>
                                {
                                    this.state.guestPlayers.map((player) => {
                                        return (
                                            <option key={player.id} value={player.id}>{player.ime} {player.prezime}</option>
                                        )
                                    })
                                }
                            </Form.Control>
                        </Form.Group>
                        <Form.Label htmlFor="minute">Minute</Form.Label>
                        <Form.Control
                            value={this.state.guestGoal.minute}
                            id="minute"
                            type="number"
                            onChange={(e) => this.valueInputChangeGuestGoal(e)}
                        />
                        <Button style={{ marginTop: "25px" }} name="guestGoal" onClick={(e) => this.create(e)}>
                                Add
                        </Button>
                    </Col>
                </Row>
            </div>
        )
    }
}

export default EditMatch;