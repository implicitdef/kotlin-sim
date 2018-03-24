window['hello-world-kotlin-js-attempt'].triggerUserEvent({name: "phat", number:345})



window['hello-world-kotlin-js-attempt'].triggerCallback((world) => {
  console.log('in the callback', world);
})