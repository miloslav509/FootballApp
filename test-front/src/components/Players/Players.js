import React from "react";
import { Button, Navbar, Table } from "react-bootstrap";
import AppAxios from "../../api/AppAxios";

class Players extends React.Component {

    constructor(props) {
        super(props);

        this.state = { players: [], sortBy: 0 }
    }

    componentDidMount() {
        this.getPlayers();
    }

    getPlayers() {
        AppAxios.get('/igraci')
            .then(res => {
                console.log(res);
                this.setState({ players: res.data });
            })
            .catch(error => {
                console.log(error);
                alert('Error occured please try again');
            });
    }

    orderByGoals() {
        this.state.players.sort((a, b) => b.brojGolova - a.brojGolova);
    }

    orderByAssist() {
        this.state.players.sort((a, b) => b.brojAsistencija - a.brojAsistencija);
       
    }

    getPosition(player){
        return this.state.players.indexOf(player) + 1;
    }

    changeToAssist() {
        this.setState({ sortBy: "assist"});
    }

    renderPlayerByGoals() {
       this.orderByGoals();
        return this.state.players.map((player, index) => {
            return (
                <tr key={player.id}>
                    <td>{this.getPosition(player)}</td>
                    <td>{player.prezime}</td>
                    <td>{player.ime}</td>
                    <th>{player.klubNaziv}</th>
                    <td>{player.brojGolova}</td>
                    <td>{player.brojAsistencija}</td>
                </tr>
            )
        })
    }

    renderPlayerByAssist() {
       this.orderByAssist();
        return this.state.players.map((player, index) => {
            return (
                <tr key={player.id}>
                    <td>{this.getPosition(player)}</td>
                    <td>{player.prezime}</td>
                    <td>{player.ime}</td>
                    <th>{player.klubNaziv}</th>
                    <td>{player.brojGolova}</td>
                    <td>{player.brojAsistencija}</td>
                </tr>
            )
        })
    }

    render() {
        return (
            <div>
                <h1>Premier League</h1>
                <Navbar variant="dark" bg="dark">
                    <Navbar.Brand>
                        Players
                    </Navbar.Brand>
                    <Navbar.Collapse className="justify-content-end">
                    <Button variant="warning" onClick={() => this.setState({sortBy: 0})} >Goals</Button>
                    <Button variant="warning" onClick={() => this.setState({sortBy: 1})} >Assist</Button>
                    </Navbar.Collapse>
                </Navbar>
                
                <div>
                    <Table style={{ margin: 5 }}>
                        <thead className="thead-light">
                            <tr>
                                <th>Position</th>
                                <th>Lastname</th>
                                <th>Name</th>
                                <th>Club</th>
                                <th>Goals</th>
                                <th>Assist</th>
                            </tr>
                        </thead>
                        <tbody>
                            {this.state.sortBy === 0 ? this.renderPlayerByGoals() : this.renderPlayerByAssist() }
                        </tbody>
                    </Table>
                </div>
            </div>
        )
    }
}

export default Players;