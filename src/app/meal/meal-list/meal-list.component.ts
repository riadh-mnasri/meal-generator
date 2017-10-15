import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs/Rx';
import {MealService} from "../meal.service";

@Component({
  selector: 'my-meals',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.scss']
})
export class MealListComponent implements OnInit {
  meals: Array<any> = [];

  constructor(private mealService: MealService) {
  }

  ngOnInit() {
    this.loadAll();
    console.log(this.meals);
  }

  loadAll() {
    this.mealService.findAllMeals().subscribe(
      (res) => this.meals = res,
      (error) => console.log(error)
    );
  }

  deleteMeal(id: number) {
    this.mealService.delete(id).subscribe((response) => {
      this.loadAll();
    });
  }

}
