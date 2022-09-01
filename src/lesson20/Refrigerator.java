package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Refrigerator {
    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {
        // есть ли такой продукт в холодильнике
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        } else {
            products.put(product, value);
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет в холодильнике!! " + product);
            return;
        }

        if (products.get(product) < value) {
            System.out.println("Не хватает, взяли всё, что было: " + product);
            products.remove(product);
            return;
        }

        if (products.get(product) == value) {


            return;
        }

        products.put(product, products.get(product) - value);
    }

    public void printAllProducts1() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void printAllProducts2(){
        for(Map.Entry<String, Integer> product:products.entrySet()){
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void canCook(Recipe recipe){
        // products - hashMap в которой все продукты из холодильника
        // recipe - список ингридиентов и название

        // проход по ингридиентам
        for(String ingr:recipe.getIngredients().keySet()){
            if (!products.containsKey(ingr)){
                System.out.println("Нет ингридиента: " + ingr);
                return;
            }
            if (products.get(ingr) < recipe.getIngredients().get(ingr)){
                System.out.println("Не хватает ингридиента: " + ingr);
                return;
            }
        }
        System.out.println("Мы можем приготовить " + recipe.getName());
    }
}
