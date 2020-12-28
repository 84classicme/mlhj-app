import React, { Component } from 'react'
import { Button, Form } from 'react-bootstrap'
class MadLibForm extends Component {
    
     constructor(props){
        super(props);
        this._numTrials = React.createRef();
        this._age = React.createRef();
        this._birthPlace  = React.createRef();
        this._startHome = React.createRef();
        this._guardian = React.createRef();
        this._mentor  = React.createRef();
        this._nice = React.createRef();
        this._endHome = React.createRef();
        this._endLocation  = React.createRef();
        this._trialLocation = React.createRef();
        this._title = React.createRef();
        this._foe  = React.createRef();
        this.submit = this.submit.bind(this);
    }
     submit = e => {
        const numTrials = this._numTrials.current.value
        const age = this._age.current.value;
        const birthPlace = this._birthPlace.current.value;
        const startHome = this._startHome.current.value
        const guardian = this._guardian.current.value;
        const mentor = this._mentor.current.value;
        const nice = this._nice.current.value
        const endHome = this._endHome.current.value;
        const endLocation = this._endLocation.current.value;
        const trialLocation = this._trialLocation.current.value
        const title = this._title.current.value;
        const foe = this._foe.current.value;

        const madlib = 
        {
            numTrials, 
            age,
            birthPlace,
            startHome,
            guardian,
            mentor,
            nice,
            endHome,
            endLocation,
            trialLocation,
            title,
            foe
        };

        e.preventDefault();
        this.props.doOnSubmit(madlib);
    }

    render(){
        return (
            <Form onSubmit={this.submit}>
                <Form.Group controlId="madlibs">
                    <Form.Label>Number between 2 and 8</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Number between 2 and 8" ref={this._numTrials}/>

                    <Form.Label>Number between 2 and 25</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Number between 2 and 25" ref={this._age}/>

                    <Form.Label>Number between 2 and 25</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Number between 2 and 25" ref={this._age}/>

                    <Form.Label>A place where you lived</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A place where you lived" ref={this._birthPlace}/>

                    <Form.Label>A type of home</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A type of home" ref={this._startHome}/>

                    <Form.Label>A family member</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Aunt, Grandfather, etc." ref={this._guardian}/>

                    <Form.Label>The name of your favorite teacher</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Teacher, instructor, coach." ref={this._mentor}/>

                    <Form.Label>A royal title</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Duchess, King, Duke, etc." ref={this._title}/>

                    <Form.Label>A place where royalty lives</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A place where royalty lives" ref={this._endHome}/>

                    <Form.Label>Another word for nice</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="Another word for nice" ref={this._nice}/>

                    <Form.Label>A place you want to visit</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A place you want to visit" ref={this._endLocation}/>

                    <Form.Label>A place from a bad dream</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A place from a bad dream" ref={this._trialLocation}/>

                    <Form.Label>A person from a bad dream</Form.Label>
                    <Form.Control  size="sm" type="text" placeholder="A person from a bad dream" ref={this._foe}/>
                </Form.Group>

                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        )
    }
}
export default MadLibForm;