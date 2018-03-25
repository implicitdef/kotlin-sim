import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";
import World from "./World";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = { world: null };
  }

  componentDidMount = () => {
    window.KotlinSim.runAndSubscribe(world => {
      this.setState({ world });
    });
  };

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
        {this.state.world && <World world={this.state.world} />}
      </div>
    );
  }
}

export default App;
