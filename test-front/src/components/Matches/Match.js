import React from "react";
import { Col, ProgressBar, Row, Card, Button, Form, Image } from "react-bootstrap";
import AppAxios from "../../api/AppAxios";
import { BiFootball } from "react-icons/bi";
import Player from 'react-player';

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
            week: -1,
            addComment: '',
            hostImage: '',
            guestImage: ''
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
                
            })
            .catch(error => {

                console.log(error);
                alert('Error occured please try again!');
            });
    }

    createComment(e) {
        e.preventDefault();
        var today = new Date();
        var month = today.getMonth() + 1;
        if (month < 10) {
            month = '0' + month;
        }
        var day = today.getDate();
        if(day < 10) {
            day = '0' + day;
        }

        var minute = today.getMinutes();
        if(minute < 10) {
            minute = '0' + minute;
        }
        var date = today.getFullYear()+'-'+month+'-'+day;
        var time = today.getHours() + ":" + minute;
        var dateTime = date+' '+time; 

        let commentDTO = {
            datumVreme: dateTime,
            korisnikKorisnickoIme: window.localStorage['username'],
            sadrzaj: this.state.addComment,
            utakmicaId: this.state.id
        }
        console.log(commentDTO);
        let res = AppAxios.post("/komentari", commentDTO)
        .then((res) => {
            console.log(res);
            alert("Comment was added succesfully");
            window.location.reload();
        })
        .catch((error) => {
            console.log(error);
            alert("Error occured please try again!");
        }) 
    }

    deleteComment(id) {
        AppAxios.delete('/komentari/' + id)
            .then(res => {
                
                console.log(res);
                alert('Comment was deleted successfully!');
                window.location.reload();
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again!');
            });
    }

    changeHandler(event) {
        let comment = event.target.value;
        this.setState({addComment: comment});
        
    }

    renderGoals() {
        return this.state.goals.map((goal, index) => {
            return (
                <Row key={goal.id}>
                    {goal.strelacKlubId === this.state.hostId ?
                        <Col> <BiFootball /> {goal.minut}' {goal.strelacPrezime} ({goal.asistentPrezime})</Col> :
                        <Col className="text-md-right"> ({goal.asistentPrezime}) {goal.strelacPrezime} {goal.minut}' <BiFootball /> </Col>
                    }
                    <p></p>
                </Row>
            )
        })
    }

    renderComments() {
        return (
            <div className='col-8 offset-1'>
                <h2>Comments</h2>
                {this.state.comments.map((comment, index) => {
                    return (
                        <>
                            <Card key={comment.id}>
                                <Card.Title>{comment.korisnikKorisnickoIme}</Card.Title>
                                <Card.Subtitle>{comment.datumVreme}</Card.Subtitle>
                                <Card.Body>
                                    <Card.Text>{comment.sadrzaj}</Card.Text>
                                    {window.localStorage['username'] === comment.korisnikKorisnickoIme ?
                                        <Button variant='danger' onClick={() => this.deleteComment(comment.id)}>Delete</Button> : null}
                                </Card.Body>

                            </Card>
                            <br />
                        </>
                    )
                })}
                <Card>
                    <Card.Header>Add a comment</Card.Header>
                    <Card.Body>
                        <Form>
                            <Form.Control
                                value={this.state.addComment}
                                id='addComment'
                                type='text'
                                onChange={(e) => this.changeHandler(e)}
                            />
                            <Button onClick={(e) => this.createComment(e)}>
                                Add
                            </Button>
                        </Form>
                    </Card.Body>
                </Card>
            </div>
        )
    }

    render() {
        return (
            <div>
                <Row>
                    <Col><h6>{this.state.week}. week</h6></Col><Col className="text-md-right"><h6>{this.state.dateTime}</h6></Col>
                </Row>
                <Row className="align-items-center displey-flex">
                    <Col></Col>
                    <Image src={this.state.hostImage} width={40} height={40}  />
                    <h3 className="text-center">{this.state.hostName} {this.state.hostGoals} - {this.state.guestGoals} {this.state.guestName}</h3>
                    <Image src={this.state.guestImage} width={40} height={40}  rounded  />
                    <Col></Col>
                </Row>
                <Row>
                    <Col>
                        {this.renderGoals()}
                    </Col>
                </Row>
                <br />
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
                    <ProgressBar now={this.state.hostPossesion} />
                    <ProgressBar variant="warning" now={this.state.guestPossesion} />
                </ProgressBar>
                <br />
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
                <br />
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
                    <ProgressBar now={100 / (this.state.hostShotsOnGoal + this.state.guestShotsOnGoal) * this.state.hostShotsOnGoal} />
                    <ProgressBar variant="warning" now={100 / (this.state.hostShotsOnGoal + this.state.guestShotsOnGoal) * this.state.guestShotsOnGoal} />
                </ProgressBar>
                <br />
                <Row>
                    <Player
                        url={this.state.videoURL}
                        controls
                        width="1200px"
                        height="760px"
                    />
                </Row>
                <br/>
                {this.renderComments()}
            </div>
        )

    }
}

export default Match;