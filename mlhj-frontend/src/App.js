import React, { Component } from "react";
import MadLibForm from "./MadLibForm";
import PropTypes from "prop-types";
import Journey from "./Journey";
import { Spinner } from "react-bootstrap";
import { API_BASE_URL } from './constants';

const fetch = require("node-fetch");
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      journey: {},
      madlib: {},
      loading: false,
      loaded: false,
    };
    this.logNumber = this.logNumber.bind(this);
    this.postJourney = this.postJourney.bind(this);
  }

  static propTypes = {
    madlib: PropTypes.object,
    journey: PropTypes.object,
    chapters: PropTypes.array,
    title: PropTypes.string,
    content: PropTypes.string,
    number: PropTypes.number,
    trials: PropTypes.array,
  };

  logNumber = (number) => console.log(`Number: ${number.value}`);

  postJourney = (answers) => {
    this.setState({ loading: true });
    this.setState({ madlib: answers });
    let jsonbody = JSON.stringify(answers);
    console.log("API URI: " + API_BASE_URL)
    fetch(API_BASE_URL, {
      method: "post",
      body: jsonbody,
      headers: { "Content-Type": "application/json" },
    })
      .then((res) => res.json())
      .then((data) => {
        this.setState({ journey: data });
        this.setState({ loading: false, loaded: true });
      })
      .then((json) => console.log("response: " + json))
      .catch((err) => console.log(err));
  };

  render() {
    return (
      <div className="container">

        <div class="jumbotron">
        <div class="container text-center">
            <h1>Mad Lib Hero Journey</h1>      
            <p>Fill out the fields below and click Get Journey to generate a Mad Libe
                style Hero's Journey. Each step of the archetypal path will use your
                choices. For a random mashup, leave the fields blank and just click.</p>
        </div>
        </div>

        <div class="row">  
            <div class="col-xs-12" id="form">
                <MadLibForm doOnSubmit={this.postJourney} />
            </div>
        </div>

        {this.state.loading && (
            <div class="row">  
                <div class="col-xs-4" />
                <div class="col-xs-4" id="loading">
                    <Spinner animation="border" />
                </div>
                
            </div>
        )}

        <div class="row">
            {this.state.loaded && (
            <div class="col-xs-12" id="display">
                <Journey {...this.state.journey} />
            </div>
            )}
        </div>
        
      </div>
    );
  }
}
export default App;
