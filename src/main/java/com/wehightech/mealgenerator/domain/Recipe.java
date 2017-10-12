package com.wehightech.mealgenerator.domain;

import java.util.List;

public class Recipe {
  private List<RecipeComponent> components;

  public Recipe(List<RecipeComponent> components) {
    this.components = components;
  }
}
