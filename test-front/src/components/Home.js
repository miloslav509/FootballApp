import React from 'react'
import AppAxios from '../api/AppAxios';

class Home extends React.Component {
  
  constructor(props) {
    super(props);

    this.state = {mathes: []}
  }

  componentDidMount() {
    this.getMatches(1);
  }

  getMatches(newPageNo) {
    const config = {
      params: {
        pageNo: newPageNo
      }
    }

    AppAxios.get('/utakmice/by-page', config)
        .then(res => {
            console.log(res);
            this.setState({mathes: res.data});
        })
        .catch(error =>{
            console.log(error);
            alert('Error occured please try again');
        });
}
  
  render() {
    return <h1>Home</h1>
  }
}

export default Home;