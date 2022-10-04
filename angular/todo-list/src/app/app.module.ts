import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BannerComponent } from './components/banner/banner.component';
import { TodosComponent } from './components/todos/todos.component';

//Without listing our components, modules, and services in @NgModule...
//Angular wouldn't recognize any of the things we're using
@NgModule({
  declarations: [ //declarations are where we list our components
    AppComponent,
    BannerComponent,
    TodosComponent
  ],
  imports: [ //imports are where we import new modules (like java packages)
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [], //providers are where we list our services
  bootstrap: [AppComponent]
})
export class AppModule { }
