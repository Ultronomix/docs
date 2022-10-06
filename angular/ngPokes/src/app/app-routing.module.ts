import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { PokedexComponent } from './components/pokedex/pokedex.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

//Remember, the routes array are how we can provide URLs to display each component
const routes: Routes = [

  {
    path:"", //so when the application first starts, this component will be rendered
    component: LoginComponent
  },
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
