import React from "react";
import AppAxios from "../../api/AppAxios";
import { Table, Image } from "react-bootstrap";

class TableView extends React.Component {

    constructor(props) {
        super(props);

        this.state = { clubs: [] }
    }

    componentDidMount() {
        this.getTable();
    }

    getTable() {
        AppAxios.get('/tabela')
            .then(res => {
                console.log(res);
                this.setState({clubs: res.data});
            })
            .catch(error =>{
                console.log(error);
                alert('Error occured please try again');
            });
    }

    renderClubs() {
        return this.state.clubs.map((club, index) => {
            return (
                <tr key={club.id}>
                    <td>{club.id}</td>
                    <td><Image src={club.klubSlika} width={50} height={50}  rounded  /> {club.klubNaziv}</td>
                    <td>{club.pobede + club.porazi + club.nereseneUtakmice}</td>
                    <td>{club.pobede}</td>
                    <td>{club.nereseneUtakmice}</td>
                    <td>{club.porazi}</td>
                    <td>{club.postignutiGolovi}</td>
                    <td>{club.primljeniGolovi}</td>
                    <td>{club.golRazlika}</td>
                    <td>{club.bodovi}</td>
                </tr>
            )
        })
    }


    render() {
        return (
            <div>
                <h1>Premier League</h1>

                <div>
                    <Table id="movies-table" style={{ margin: 5 }}>
                        <thead className="thead-dark">
                            <tr>
                                <th>Position</th>
                                <th>Club</th>
                                <th>Played</th>
                                <th>Won</th>
                                <th>Drawn</th>
                                <th>Lost</th>
                                <th>GF</th>
                                <th>GA</th>
                                <th>GD</th>
                                <th>Points</th>
                            </tr>
                        </thead>
                        <tbody>
                            {this.renderClubs()}
                        </tbody>
                    </Table>
                </div>
            </div>
        )
    }
}



export default TableView;