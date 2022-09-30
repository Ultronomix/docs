import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TodosComponent } from './components/todos/todos.component';


//in this Routes Array, we can specify components, and the url that makes them render
//THIS IS HOW WE CAN GET COMPONENTS MOVING IN AND OUT OF OUR WEBPAGE
const routes: Routes = [

  //each route is an OBJECT 
  {
    path: "todos", //path is the URL you must navigate to in order to render this component
    component: TodosComponent //component is the Class name of the component in question
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
