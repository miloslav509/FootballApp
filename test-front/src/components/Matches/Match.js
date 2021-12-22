import React from "react";
import { Col, ProgressBar, Row } from "react-bootstrap";
import AppAxios from "../../api/AppAxios";

class Match extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            id: -1,
            hostId: -1,
            hostName: '',
            guestId: -1,
            guestName: '',
            dateTime: '',
            hostGols: -1,
            guestGols: -1,
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
            comments: []
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
                    goals: match.golovi
                })
                console.log(this.state);
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    render() {
        return (
            <div>
                <Row>
                    <Col>
                        {this.state.hostPossesion}%
                    </Col>
                    <Col className="text-md-right">
                        {this.state.guestPossesion}%
                    </Col>
                </Row>    
                <ProgressBar>
                    <ProgressBar now={this.state.hostPossesion}/>
                    <ProgressBar variant="warning" now={this.state.guestPossesion} />
                </ProgressBar>
            </div>
        )

    }
}

export default Match;