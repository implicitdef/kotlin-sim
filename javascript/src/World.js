import React, { Component } from "react";

class World extends Component {
  render() {
    const { world: { state, age } } = this.props;
    return (
      <div>
        <h1>{state}</h1>
        <h3>{age}</h3>
      </div>
    );
  }
}

export default World;
