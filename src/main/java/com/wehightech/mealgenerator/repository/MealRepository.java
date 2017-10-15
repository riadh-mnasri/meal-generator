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
    this.meals.put(new Long(10), new Meal(new Long(10), "Fricassé", "Fricassé", "/assets/images/Fricasse.jpg"));
    this.meals.put(new Long(11), new Meal(new Long(11), "Crèpes", "Crèpes", "/assets/images/Crepes.jpg"));
    this.meals.put(new Long(12), new Meal(new Long(12), "Quiche", "Quiche", "/assets/images/Quiche.jpg"));
    this.meals.put(new Long(13), new Meal(new Long(13), "Tajine Tunisien", "Tajine Tunisien", "/assets/images/Tajine-Tunisien.jpg"));
    this.meals.put(new Long(14), new Meal(new Long(14), "Mlawi", "Mlawi", "/assets/images/Mlawi.jpg"));
    this.meals.put(new Long(15), new Meal(new Long(15), "Brik", "Brik", "/assets/images/Brike.jpg"));
    this.meals.put(new Long(16), new Meal(new Long(16), "Chorba", "Chorba", "/assets/images/Chorba.jpg"));
    this.meals.put(new Long(17), new Meal(new Long(17), "Mloukhia", "Mloukhia", "/assets/images/Mloukhia.jpg"));
    this.meals.put(new Long(18), new Meal(new Long(18), "Chappatti Tunisien", "Chappatti Tunisien", "/assets/images/Chappatti-Tunisien.jpg"));
    this.meals.put(new Long(19), new Meal(new Long(19), "Soufflet", "Soufflet", "/assets/images/Soufflet.jpg"));
    this.meals.put(new Long(20), new Meal(new Long(20), "Makloub", "Makloub", "/assets/images/Makloub.jpg"));
    this.meals.put(new Long(21), new Meal(new Long(21), "Ojja Merguez", "Ojja Merguez", "/assets/images/Ojja-Merguez.jpg"));
    this.meals.put(new Long(22), new Meal(new Long(22), "Chakchouka", "Chakchouka", "/assets/images/Chakchouka.jpg"));
    this.meals.put(new Long(23), new Meal(new Long(23), "Keftaji", "Keftaji", "/assets/images/Keftaji.jpg"));
    this.meals.put(new Long(24), new Meal(new Long(24), "Leblabi", "Leblabi", "/assets/images/Leblabi.jpg"));
    this.meals.put(new Long(25), new Meal(new Long(25), "Poulet Rôti", "Poulet Rôti", "/assets/images/Poulet-Roti.jpg"));

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
