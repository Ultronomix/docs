import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

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

}
