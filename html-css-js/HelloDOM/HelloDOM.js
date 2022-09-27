
//this demo will demonstrate DOM selection/manipualtion
//as well as events and event listeners


//assign a variable to apply to our button 
let myButton = document.getElementById("b1")

//event listeners take in the event we're listening for, and the function to execute
myButton.addEventListener("click", domFunction)

function domFunction() {

    //I want to change the button's text
    myButton.textContent = "thanks for the click!"

    //I want to change the paragraph's color
    
    //first we need to declare a variable
    let myParagraph = document.getElementById("p1")

    //setAttribute lets us change elements attributes directly
    //this is not the best practice technically, but it's "ok"
    //two parameters - what attribute we want to change, and how we want to change it.
    myParagraph.setAttribute("style", "color:red; background-color:black; font-family:calibri")

}

//get the h3 with DOM selection
let header = document.getElementById("h3")

//this is a faster way to add eventListeners
header.onmouseover = hoverFunc

function hoverFunc(){
    header.textContent = "don't touch me!!!"
}

header.onmouseleave = releaseFunc 

function releaseFunc(){
    header.textContent = "why did you leave :("
}

