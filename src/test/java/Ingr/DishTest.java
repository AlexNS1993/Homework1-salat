package Ingr;

import Ingr.Ingredients.Cucumber;
import Ingr.Ingredients.Onion;
import Ingr.Ingredients.Pepper;
import Ingr.Ingredients.Tomato;
import org.junit.Assert;

import static org.junit.Assert.*;

public class DishTest {

    @org.junit.Test
    public void calcSumCalories() {
        Cucumber cucumber = new Cucumber("Огурец колючий", 30);
        Onion onion = new Onion("Лук обычный", 55);
        Pepper pepper = new Pepper("Перец сладкий", 80);
        Tomato tomato = new Tomato("Помидор слива", 35);

        Dish salat = new Dish("Салат весенний");

        salat.getIngredients().add(cucumber);
        salat.getIngredients().add(onion);
        salat.getIngredients().add(pepper);
        salat.getIngredients().add(tomato);

        int actual = salat.calcSumCalories();
        int expected = 200;

        assertEquals(expected, actual);
    }
}