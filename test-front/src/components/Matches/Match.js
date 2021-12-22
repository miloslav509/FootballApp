import React from "react";

class Match extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            id: -1,
            block:false,
            name: '', 
            description:'', 
            views:'', 
            dateTime:'', 
            allowedComment:false, 
            comments:[], 
            likesDislikes:[],
            allowedLikes: false,
            videoURL:'', 
            addComment:'',
        }
    }

    render() {
        return (
            <div>Match</div>
        )
        
    }
}

export default Match;