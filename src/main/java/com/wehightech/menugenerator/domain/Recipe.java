package com.wehightech.menugenerator.domain;

import java.util.List;

public class Recipe {
  private List<RecipeComponent> components;

  public Recipe(List<RecipeComponent> components) {
    this.components = components;
  }
}
