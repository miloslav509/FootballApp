import React from "react";
import ReactDOM from "react-dom";
import { Route, Link, HashRouter as Router, Switch, Redirect } from "react-router-dom";
import { Navbar, Nav, Container, Button } from "react-bootstrap";
import Home from './components/Home';
import 'bootstrap/dist/css/bootstrap.min.css';
import NotFound from './NotFound';
import Login from './components/Login';
import {logout} from './services/auth';
import Match from "./components/Matches/Match";
import Table from "./components/Table/Table";
import AddMatch from "./components/Matches/AddMatch";
import EditMatch from "./components/Matches/EditMatch";

class App extends React.Component {

    render() {

        const jwt = window.localStorage['jwt'];
    
        if(jwt){return (
          <div>
            <Router>
              <Navbar expand bg="dark" variant="dark">
                <Navbar.Brand as={Link} to="/">
                    JWD
                </Navbar.Brand>
                <Nav>
                  <Nav.Link as={Link} to="/table">
                    Table
                  </Nav.Link>
                    <Button onClick={()=>logout()}>Logout</Button>
                </Nav>
              </Navbar>
              <Container style={{paddingTop:"25px"}}>
                <Switch>
                  <Route exact path="/" component={Home} />
                  <Route exact path="/login"  render={()=><Redirect to="/"/>}/>
                  <Route exact path="/table" component={Table}/>
                  <Route exact path='/match/add' component={AddMatch}/>
                  <Route exact path="/match/:id" component={Match}/>
                  <Route exact path='/match/addstats/:id' component={EditMatch}/>
                  <Route component={NotFound} />
                </Switch>
              </Container>
            </Router>
          </div>
        );
      }else{
        return( <Container>
          <Router>
            <Switch>
              <Route exact path="/login" component={Login}/>
              <Route render={()=> <Redirect to = "/login"/>}/>
            </Switch>
          </Router>
        </Container>);
       
      }
          
      }
};

ReactDOM.render(
    <App/>,
    document.querySelector('#root')
);
