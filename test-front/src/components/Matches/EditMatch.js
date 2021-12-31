import React from "react";
import AppAxios from "../../api/AppAxios";
import { Row, Col, Image, Form } from 'react-bootstrap';

class EditMatch extends React.Component {

    constructor(props) {
        super(props);

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
            hostPlayerGaol: '',
            guestPlayerGola: '',
            hostPlayers: [],
            guestPlayers: []
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

    valueInputChange(e) {

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
                            <Form.Label htmlFor="hostGaol">Guest goal</Form.Label>
                            <Form.Control as="select" id="hostPlayerId" name="hostPlayerId" value={this.state.hostPlayerGaol} onChange={(e) => this.valueInputChange(e)}>
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
                    </Col>
                </Row>
            </div>
        )
    }
}

export default EditMatch;