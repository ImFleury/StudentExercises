

function toggleButton(){
    currentState = !currentState;
    let direction = (currentState == true)? 'column': 'row';
    document.getElementById('container').style.flexDirection = direction;

   
    // This is an equivalent code block
    // container = document.getElementById('container');
    // if (currentState == true){
    //     container.style.flexDirection =  'column';
    // } else {
    //     container.style.flexDirection = 'row';
    // }

     // This is an equivalent code block
     // document.getElementById('container').style.flexDirection =  (currentState == true)? 'column': 'row';
}

document.addEventListener('DOMContentLoaded', () => {
  let currentState = true;
  let direction  = 'row';
    
    const demoButton = document.getElementById('demoButton');
    // demoButton.addEventListener('click',  () => { toggleButton()}) ;
    //  or use 
    demoButton.addEventListener('click',  () => { 
        currentState = !currentState;
        direction = (currentState == true)? 'row': 'column' ;
        
      // use this when referencing a single element by id
      //  document.getElementById('container').style.flexDirection = direction;

      // This code blocks works on multiple divs with a class of boxContainer
       let myNodelist = document.querySelectorAll(".boxContainer");
        for (let i = 0; i < myNodelist.length; i++) {
          myNodelist[i].style.flexDirection = direction;
        }

        const displayMessage = document.getElementById('displayMessage');
       // displayMessage.innerText = currentState ? 'true': 'false';
       displayMessage.innerText = `${currentState} ${direction}`;
       event.stopPropagation();
    }) ;

    displayMessage.innerText = `${currentState} ${direction}`;
});