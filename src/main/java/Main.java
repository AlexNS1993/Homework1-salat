import Ingr.Dish;
import Ingr.Ingredients.*;

public class Main {
    public static void main(String[] args) {
        Cucumber cucumber = new Cucumber("Огурец колючий", 30);
        Onion onion = new Onion("Лук обычный", 55);
        Pepper pepper = new Pepper("Перец сладкий", 80);
        Tomato tomato = new Tomato("Помидор слива", 35);

        Dish salat = new Dish("Салат весенний");

        salat.getIngredients().add(cucumber);
        salat.getIngredients().add(onion);
        salat.getIngredients().add(pepper);
        salat.getIngredients().add(tomato);

        salat.sort();
        salat.print(50);

        salat.cook();
    }
}
