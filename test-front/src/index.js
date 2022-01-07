import React from "react";
import ReactDOM from "react-dom";
import { Route, Link, HashRouter as Router, Switch, Redirect } from "react-router-dom";
import { Navbar, Nav, Container, Button } from "react-bootstrap";
import Home from './components/Home';
import 'bootstrap/dist/css/bootstrap.min.css';
import NotFound from './NotFound';
import Login from './components/Login';
import { logout } from './services/auth';
import Match from "./components/Matches/Match";
import Table from "./components/Table/Table";
import AddMatch from "./components/Matches/AddMatch";
import EditMatch from "./components/Matches/EditMatch";
import Players from "./components/Players/Players";

class App extends React.Component {

  render() {

    const jwt = window.localStorage['jwt'];
    const role = window.localStorage['role'];

    return (
      <div>
        <Router>
          <Navbar expand bg="dark" variant="dark">
            <Navbar.Brand as={Link} to="/">
              Home
            </Navbar.Brand>
            <Nav>
              <Nav.Link as={Link} to="/table">
                Table
              </Nav.Link>
              <Nav.Link as={Link} to="/players">
                Players
              </Nav.Link>
              {jwt ? <Button onClick={() => logout()}>Logout</Button> : <Nav.Link as={Link} to="/login">
                Login
              </Nav.Link>}
            </Nav>
          </Navbar>
          <Container style={{ paddingTop: "25px" }}>
            <Switch>
              <Route exact path="/" component={Home} />
              {jwt ? null : <Route exact path="/login" component={Login} />} />}
              <Route exact path="/login" render={() => <Redirect to="/" />} />
              <Route exact path="/table" component={Table} />
              <Route exact path="/players" component={Players} />
              {jwt && role === "ROLE_ADMIN" ? <Route exact path='/match/add' component={AddMatch} /> : null}
              <Route exact path="/match/:id" component={Match} />
              {jwt && role === "ROLE_ADMIN" ? <Route exact path='/match/addstats/:id' component={EditMatch} /> : null}
              <Route component={NotFound} />
            </Switch>
          </Container>
        </Router>
      </div>
    )


  }

}

ReactDOM.render(
  <App />,
  document.querySelector('#root')
);
