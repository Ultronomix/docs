import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';
import {Router} from '@angular/router'; 

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //I need a variable to hold the login prompt OR failed login message
  message:string = "Log in to your Pokedex"

  //this User object will get filled with the user inputs, and sent in the loginFunction()
  //In your P2, this will likely be your credentials class
  user:User = {
    username:"",
    password:""
  }

  constructor(private us:UserService, private route:Router) { }

  ngOnInit(): void {
  }

  loginFunction(){

    //this function will call the login() function in the UserService
    //it will send the inputted username and password as one user object
    this.us.login(this.user).subscribe(
      
      //if you're using a variable (like data in this case), we need a more fleshed out arrow function
      (data:any) => {
        console.log(data)
        this.us.user = data; //the user in the UserService gets populated with the API's user data
        this.route.navigate(['welcome'])
      },

      //if we don't need any variables (like if we're just checking for an error), we can use shorthand
      err => {
        console.log('HTTP Error')
        this.message = "Login Failed! Try again..."
      },

      () => {
        this.message = "Login Failed! Try again..."
      }

    )

  }

}
