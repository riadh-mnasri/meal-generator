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
    this.meals.put(new Long(1), new Meal(new Long(1), "Pavé saumon", "Pavé Saumon grillé", "/assets/images/Pave-Saumon.jpg"));
    this.meals.put(new Long(2), new Meal(new Long(2), "Omelette fromage", "Omelette fromage avec du pain complet", "/assets/images/Omelette-Fromage.jpg"));
    this.meals.put(new Long(3), new Meal(new Long(3), "Pâtes", "Pâtes Penne avec Sauce tomate et ail", "/assets/images/Pates-Penne.jpg"));
    this.meals.put(new Long(4), new Meal(new Long(4), "Pizza", "Pizza au thon", "/assets/images/Pizza-Thon.jpg"));
    this.meals.put(new Long(5), new Meal(new Long(5), "Couscous Agneau", "Couscous Agneau", "/assets/images/Couscous-Agneau.jpg"));
    this.meals.put(new Long(6), new Meal(new Long(6), "Ragoût poulet", "Ragoût poulet", "/assets/images/Ragout-Poulet.jpg"));
    this.meals.put(new Long(7), new Meal(new Long(7), "Poisson Grillé", "Poisson Grillé", "/assets/images/Poisson-Grille.jpg"));
    this.meals.put(new Long(8), new Meal(new Long(8), "Riz à la sausse oignon et tomates", "Riz à la sausse oignon et tomates", "/assets/images/Riz-Sauce-Oignon-Tomates.jpg"));
    this.meals.put(new Long(9), new Meal(new Long(9), "Salade gourmande", "Salade gourmande", "/assets/images/Salade-Gourmande.jpg"));
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
