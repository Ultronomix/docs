import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pokemon } from '../models/pokemon';

//Services come with the @Injectable decorator because we're meant to inject them into components.
//in this way, we can share functionality and data between components.
@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  //I want a counter variable to count number of pokemon seen

  //I want a pokemon object to hold the latest pokemon data

  //we need to inject HttpClient in order to make HTTP requests in this service
  constructor(private http:HttpClient) { }

  //HTTP calls below-------------------------------------------

  //This function will GET a pokemon from pokeAPI given a user inputted id
  getPokemonFromAPI(id:number):Observable<HttpResponse<Pokemon>>{

    //we send a request to the pokeapi using the user's input as the endpoint
    //{observe: response} is what lets us actually get the incoming data (response body!!!)
    return this.http.get("https://pokeapi.co/api/v2/pokemon/" + id + "/", {observe: "response"}) as Observable<HttpResponse<Pokemon>>

  }

  //hypothetical function to make a POST request to the pokeAPI
  sendPokemonToAPI(pokemon:Pokemon):Observable<Pokemon>{
    //note, POST takes a URL, and a request body (your data)
    return this.http.post("URL WOULD GO HERE", pokemon) as Observable<Pokemon>
  }

}
