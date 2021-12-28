import React from 'react'
import AppAxios from '../api/AppAxios';
import { Button, Table, ButtonGroup, Image } from 'react-bootstrap';

class Home extends React.Component {

  constructor(props) {
    super(props);

    this.state = { 
        matches: [],
        pageNo: -1,
        totalPages: 1 
      }
  }

  componentDidMount() {
    this.getMatches(0);
  }

  getMatches(newPageNo) {
    const config = {
      params: {
        pageNo: newPageNo
      }
    }

    AppAxios.get('/utakmice', config)
      .then(res => {
        console.log(res);
        this.setState({ 
          matches: res.data, 
          pageNo: newPageNo,
          totalPages: res.headers["total-pages"]
        });
        console.log(this.state);
      })
      .catch(error => {
        console.log(error);
        alert('Error occured please try again');
      });
  }

  goToStats(id) {
    this.props.history.push('/match/' + id);
  }

  goToAddStats(id) {
    this.props.history.push('/match/addstats/' + id);
  }

  renderMatches() {
    return this.state.matches.map((match, index) => {
      return (
        <tr key={match.id}>
          <td>{match.datumVreme}</td>
          <td><Image src={match.domacinSlika} width={40} height={40}  rounded  /> {match.domacinNaziv} {match.goloviDomacin} - {match.goloviGost} {match.gostNaziv} <Image src={match.gostSlika} width={40} height={40}  rounded  /></td>
          {match.odigrana ?
            [<td><Button variant="success" onClick={() => this.goToStats(match.id)} >Stats</Button></td>]
            : null}
            {window.localStorage['role'] == 'ROLE_ADMIN'?
            [<td><Button variant="info" onClick={() => this.goToAddStats(match.id)} >Add stats</Button></td>]
            : null}
        </tr>
      )
    })
  }

  render() {
    return (
      <div>
        <Table id="movies-table" style={{ margin: 5 }}>
          <thead>
            <tr>
              <th>England:Premier League</th>
            </tr>
          </thead>
          <tbody>
            {this.renderMatches()}
          </tbody>
        </Table>
        <ButtonGroup>
          <Button disabled={this.state.pageNo === 0} onClick={() => this.getMatches(this.state.pageNo - 1)}>Prev</Button>
          <Button disabled={this.state.pageNo === this.state.totalPages - 1} onClick={() => this.getMatches(this.state.pageNo + 1)}>Next</Button>
        </ButtonGroup>
      </div>
    )
  }
}

export default Home;