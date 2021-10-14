package com.epam.sergeiko.salat.ingredients_of_salat.Ingredients;

import com.epam.sergeiko.salat.Interfaces.Iingredient;

public class AIngredient implements Comparable<AIngredient>, Iingredient {
    private String name;
    private int calories;

    public AIngredient(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(AIngredient o) {
        AIngredient input = (AIngredient) o;
        if (this.getCalories() > input.getCalories())
            return 1;
        else if (this.getCalories() < input.getCalories())
            return -1;
        else return 0;
    }
}
