import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {MealListComponent} from "./meal/meal-list/meal-list.component";
import {MealService} from "./meal/meal.service";
import {Http, HttpModule} from "@angular/http";

@NgModule({
  declarations: [
    AppComponent,
    MealListComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
  ],
  providers: [MealListComponent, MealService],
  bootstrap: [AppComponent]
})
export class AppModule { }
