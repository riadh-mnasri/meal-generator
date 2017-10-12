package com.wehightech.mealgenerator.repository;

import com.wehightech.mealgenerator.domain.Meal;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MealRepository {
  private Map<Long, Meal> meals = new HashMap<>();

  public MealRepository() {
    this.meals.put(new Long(1), new Meal(new Long(1), "Pavé saumon", "Pavé Saumon grillé"));
    this.meals.put(new Long(2), new Meal(new Long(2), "Omelette fromage", "Omelette fromage avec du pain complet"));
    this.meals.put(new Long(3), new Meal(new Long(3), "Pâtes", "Pâtes Penne avec Sauce tomate et ail"));
  }

  public Meal saveMeal(Meal meal) {
    if (meal != null) {
      meals.put(meal.getId(), meal);
    }
    return meal;
  }

  public List<Meal> findAll() {
    return meals.values().stream().collect(Collectors.toList());
  }

  public Meal findById(Long id) {
    return meals.get(id);
  }

  public void deleteMeal(Long id) {
     meals.remove(id);
  }

}
