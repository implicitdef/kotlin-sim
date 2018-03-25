window.KotlinSim.triggerUserEvent({name: "phat", number:345})



window.KotlinSim.triggerCallback((world) => {
  console.log('in the callback', world);
});