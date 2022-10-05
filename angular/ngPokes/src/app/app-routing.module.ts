import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokedexComponent } from './components/pokedex/pokedex.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

//Remember, the routes array are how we can provide URLs to display each component
const routes: Routes = [

  {
    path:"welcome", //path is the URL we can use to access the component
    component: WelcomeComponent //component is the component we intend to access
  },

  {
    path:"pokedex",
    component: PokedexComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
