import React from "react";
import ReactDOM from "react-dom";
import { Route, Link, HashRouter as Router, Switch, Redirect } from "react-router-dom";
import { Navbar, Nav, Container, Button } from "react-bootstrap";
import Home from './components/Home';
import 'bootstrap/dist/css/bootstrap.min.css';
import NotFound from './NotFound';
import Login from './components/Login';
import {logout} from './services/auth';
import Festivali from './components/Festivali';
import AddFestival from './components/AddFestival';
import EditFestival from "./components/EditFestival";
import Rezervisi from './components/Rezervisi';
// import EditAutomobil from './components/EditAutomobil';

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
                  <Nav.Link as={Link} to="/festivali">
                    Festivali
                  </Nav.Link>
                    <Button onClick={()=>logout()}>Logout</Button>
                </Nav>
              </Navbar>
              <Container style={{paddingTop:"25px"}}>
                <Switch>
                  <Route exact path="/" component={Home} />
                  <Route exact path="/login"  render={()=><Redirect to="/"/>}/>
                  <Route exact path="/festivali" component={Festivali} />
                  <Route exact path="/festivali/dodaj" component={AddFestival} />
                  <Route exact path="/festivali/izmeni/:id" component={EditFestival} />
                  <Route exact path="/festivali/rezervisi/:id" component={Rezervisi} />
                 
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
