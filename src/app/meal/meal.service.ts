import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import {Meal} from './meal';

@Injectable()
export class MealService {

  private resourceUrl = 'api/meal';
  constructor(private http: Http) { }

  findAllMeals(): Observable<Array<Meal>> {
    return this.http.get(this.resourceUrl).map((res: Response) => {
      const jsonResponse = res.json();

      return jsonResponse;
    });
  }

  find(id: number): Observable<Meal> {
    return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
      const jsonResponse = res.json();
      return jsonResponse;
    });
  }

  create(meal: Meal): Observable<Meal> {
    const copy = this.convert(meal);
    return this.http.post(this.resourceUrl, copy).map((res: Response) => {
      const jsonResponse = res.json();
      return jsonResponse;
    });
  }

  delete(id: number): Observable<Response> {
    return this.http.delete(`${this.resourceUrl}/${id}`);
  }

  update(meal: Meal): Observable<Meal> {
    const copy = this.convert(meal);
    // an update should better use PUT :(
    return this.http.post(this.resourceUrl, copy).map((res: Response) => {
      const jsonResponse = res.json();
      return jsonResponse;
    });
  }

  private convert(meal: Meal): Meal {
    const copy: Meal = Object.assign({}, meal);
    return copy;
  }
}
