import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokemonService } from 'src/app/services/pokemon.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  //this counter variable will call DIRECTLY from the PokemonService
  pokeCount:number = this.ps.pokeCounter

  //this pokemon object will call DIRECTLY from the PokemonService
  pokemon:Pokemon = this.ps.pokemon

  //this variable holds the user's username, stored in the user object in the UserService
  username:string = this.us.user.username;

  /* The PokemonService is getting the above data from the pokedex component. 
     INTER-COMPONENT COMMUNICATION!
  */

  //the constructor gets invoked first
  constructor(private ps:PokemonService, private us:UserService) { }

  //THEN the ngOnInit is invoked
  ngOnInit(): void {
  }

}
