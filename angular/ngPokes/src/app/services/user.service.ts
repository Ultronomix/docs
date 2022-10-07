import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  //initially empty User object (to be filled upon successful login)
  user:User = {
    username:"",
    password:""
  }

  //we need to inject HttpClient in order to make HTTP calls
  constructor(private http:HttpClient) { }

  login(userCreds:User):Observable<HttpResponse<User>>{

      if(userCreds.username.length < 8){
        
      }

    return this.http.post("http://localhost:5000/taskmaster/auth/pokeLogin", userCreds) as Observable<HttpResponse<User>>

  }

}
