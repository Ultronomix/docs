import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { PokedexComponent } from './components/pokedex/pokedex.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './components/login/login.component'
import { PokemonService } from './services/pokemon.service';

//The @NgModule is what makes the angular app aware of all of the components/modules/services
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    WelcomeComponent,
    PokedexComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, //we cannot take user input with two way binding if we don't import this module
    HttpClientModule //we cannot make HTTP requests with observables if we don't import this module
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
