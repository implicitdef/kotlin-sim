import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';


window.KotlinSim.triggerUserEvent({name: "phat", number:345})



window.KotlinSim.triggerCallback((world) => {
  console.log('in the callback', world);
});


ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();
