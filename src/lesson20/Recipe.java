package lesson20;

import java.util.HashMap;

public class Recipe {
    private String name;
    private HashMap<String, Integer> ingredients = new HashMap<>();

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(String ingredient, int value) {
        if (ingredients.containsKey(ingredient)) {
            ingredients.put(ingredient, value + ingredients.get(ingredient));
        } else {
            ingredients.put(ingredient, value);

        }
    }
}
