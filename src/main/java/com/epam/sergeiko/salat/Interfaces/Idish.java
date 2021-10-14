package com.epam.sergeiko.salat.Interfaces;

import com.epam.sergeiko.salat.ingredients_of_salat.Ingredients.AIngredient;

import java.util.List;

public interface Idish {
    void cook();
    int calcSumCalories();

    String getName();
    List<AIngredient> getIngredients();
}
