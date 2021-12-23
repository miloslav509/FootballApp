import React from "react";
import { Col, ProgressBar, Row } from "react-bootstrap";
import AppAxios from "../../api/AppAxios";
import { BiFootball } from "react-icons/bi"

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
            comments: [],
            week: -1
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
                    week: match.kolo
                })
                console.log(this.state);
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    renderGoals() {
        return this.state.goals.map((goal, index) => {
            return (
              <Row key={goal.id}>
                  {goal.strelacKlubId === this.state.hostId ? 
                  <Col> <BiFootball/> {goal.minut}' {goal.strelacPrezime} ({goal.asistentPrezime})</Col> :
                  <Col className="text-md-right"> ({goal.asistentPrezime}) {goal.strelacPrezime} {goal.minut}' <BiFootball/> </Col>
                    }
                  <p></p>
              </Row>
            )
          })
    }

    render() {
        return (
            <div>
                <Row>
                    <Col><h6>{this.state.week}. week</h6></Col><Col className="text-md-right"><h6>{this.state.dateTime}</h6></Col>
                </Row>    
                <Row>
                    <Col>
                        <h3 className="text-center">{this.state.hostName} {this.state.hostGoals} - {this.state.guestGoals} {this.state.guestName}</h3>
                    </Col>
                </Row>
                <Row>
                    <Col>
                        {this.renderGoals()}
                    </Col>
                </Row>
                <br/>
                <h6 className="text-center">Possesion</h6>
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
                <br/>
                <h6 className="text-center">Shots</h6>
                <Row>
                    <Col>
                        {this.state.hostShots}
                    </Col>
                    <Col className="text-md-right">
                        {this.state.guestShots}
                    </Col>
                </Row>   
                <ProgressBar>
                    <ProgressBar now={100 / (this.state.hostShots + this.state.guestShots) * this.state.hostShots} />
                    <ProgressBar variant="warning" now={100 / (this.state.hostShots + this.state.guestShots) * this.state.guestShots} />
                </ProgressBar>
                <br/>
                <h6 className="text-center">Shots on goal</h6>
                <Row>
                    <Col>
                        {this.state.hostShotsOnGoal}
                    </Col>
                    <Col className="text-md-right">
                        {this.state.guestShotsOnGoal}
                    </Col>
                </Row> 
                <ProgressBar>
                    <ProgressBar now={100 / (this.state.hostShotsOnGoal + this.state.guestShotsOnGoal) * this.state.hostShotsOnGoal}/>
                    <ProgressBar variant="warning" now={100 / (this.state.hostShotsOnGoal + this.state.guestShotsOnGoal) * this.state.guestShotsOnGoal} />
                </ProgressBar>
            </div>
        )

    }
}

export default Match;