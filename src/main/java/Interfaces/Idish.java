package Interfaces;

import Ingr.Ingredients.AIngredient;

import java.util.List;

public interface Idish {
    void cook();
    int calcSumCalories();

    String getName();
    List<AIngredient> getIngredients();
}
