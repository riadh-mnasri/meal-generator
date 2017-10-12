package com.wehightech.mealgenerator.rest;

import com.wehightech.mealgenerator.domain.Meal;
import com.wehightech.mealgenerator.repository.MealRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meal")
public class MealController {

  private MealRepository mealRepository;

  public MealController(MealRepository mealRepository) {
    this.mealRepository = mealRepository;
  }

  @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  Meal saveMeal(@RequestBody Meal meal) {
    return mealRepository.saveMeal(meal);
  }

  @DeleteMapping(path = "/{mealId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  void deleteMeal(@PathVariable("mealId") long mealId) {
     mealRepository.deleteMeal(mealId);
  }


  @GetMapping(path = "/{mealId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  Meal getMealById(@PathVariable("mealId") long mealId) {
    return mealRepository.findById(mealId);
  }

  @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  List<Meal> getAllMeals() {
    return mealRepository.findAll();
  }
}
