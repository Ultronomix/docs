import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-pokedex',
  templateUrl: './pokedex.component.html',
  styleUrls: ['./pokedex.component.css']
})
export class PokedexComponent implements OnInit {

  //this variable will hold the user input for pokemon id to search for
  userInput:number = 0;

  //pokemon object to get filled with incoming pokemon data
  public pokemon:Pokemon = {
    name:"",
    types:"",
    sprites:""
  }

  //We need to INJECT the pokemon service in order to use it's functions
  constructor(private ps:PokemonService) { }

  //the ngOnInit is nice for anything you want to happen when the component renders
  ngOnInit(): void {
  }

  //This is the function that GETs our pokemon data from the pokemon service
  getPokemon(){

    //invoke the service method with the given userInput
    //we can access and use the observable data from the subscribe method()
    this.ps.getPokemonFromAPI(this.userInput).subscribe(

      (data:any) => {
        this.pokemon = data.body; //get the data out of the response body and assign it to our Pokemon
        console.log(this.pokemon); //just to see the incoming data
      }

    )
  }


}
