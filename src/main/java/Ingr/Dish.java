package Ingr;

import Ingr.Ingredients.AIngredient;
import Interfaces.Idish;
import Interfaces.Iingredient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dish implements Idish {
    private String name;
    private List<AIngredient> ingredients = new ArrayList<>();

    public void sort() {
        Collections.sort(ingredients);
    }

    public void print(int calories) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getCalories() > calories) {
                System.out.println(ingredients.get(i));
            }
        }
    }
    public Dish(String name) {
        this.name = name;
    }
    @Override
    public void cook() {
        System.out.println("Блюдо '" + name + "' готово, общий калораж: " + calcSumCalories());
        }
    @Override
    public int calcSumCalories() {
        int commonCalories = 0;
        for (Iingredient product : this.ingredients) {
            commonCalories += product.getCalories();
        }
        return commonCalories;
    }

    public List<AIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<AIngredient> ingredients) {

        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

