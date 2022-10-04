import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

  //a variable that determines whether our greeterDiv renders
  greeterDivToggle:boolean = true;
  //a variable that holds the user inputted name
  name:string = "";
  //this variable gets updated once the user submits their name
  finalName:string = "";


  //a variable that determines whether the todo cards are hidden or not
  hiddenToggle:boolean = true;
  //a variable that determines what the button says
  buttonMessage:string = "Show Tasks"

  //to do objects that we'll render onto our HTML using String Interpolation (one way binding!!)
  todo1 = {
    id: 1,
    task: "wake up",
    status: "Incomplete"
  }

  todo2 = {
    id: 2,
    task: "grab a brush",
    status: "Incomplete"
  }

  todo3 = {
    id: 3,
    task: "put a little makeup",
    status: "Incomplete"
  }

  todo4 = {
    id: 4,
    task: "have a great day",
    status: "Incomplete"
  }

  todo5 = {
    id: 5,
    task: "go to sleep",
    status: "Incomplete"
  }

  todo6 = {
    id: 6,
    task: "go to sleep again",
    status: "Incomplete"
  }

  //make an Array to hold my todo objects in order to use in the *ngFor directive
  todosArray = [this.todo1, this.todo2, this.todo3, this.todo4, this.todo5, this.todo6]

  constructor() { }

  ngOnInit(): void {
  }

  //function to toggle the todo list visibility
  showTodoList(){
    this.hiddenToggle = !this.hiddenToggle
    //setting the boolean to the opposite of its current value

    if(this.hiddenToggle){
      this.buttonMessage = "Show Tasks"
    } else {
      this.buttonMessage = "Hide Tasks"
    }
  } 

  //function to toggle the greeter div funcitonality after the user submits their name
  //it will also set the "finalName" variable to whatever is in the "name" variable
  submitName(){
    this.finalName = this.name;
    this.greeterDivToggle = false;
  }

}
