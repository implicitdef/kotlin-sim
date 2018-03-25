import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App";

//window.KotlinSim.triggerUserEvent({ name: "phat", number: 345 });

/*
window.KotlinSim.runAndSubscribe(world => {
  console.log("the world is ", world);
});
*/

ReactDOM.render(<App />, document.getElementById("root"));
