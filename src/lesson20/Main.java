package lesson20;

public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.putProduct("Яблоко", 2);
        refrigerator.putProduct("Груша", 2);
        refrigerator.putProduct("Киви", 3);
        refrigerator.putProduct("Сливки", 1);
        refrigerator.putProduct("Сахар", 6);
        refrigerator.putProduct("Яблоко", 3);

//        refrigerator.getProduct("Бананы", 8);
//        refrigerator.getProduct("Яблоко", 8);

//        refrigerator.printAllProducts1();
//        refrigerator.printAllProducts2();

        Recipe recipe = new Recipe("Фруктовый салат");
        recipe.addIngredient("Яблоко", 1);
        recipe.addIngredient("Груша", 1);
        recipe.addIngredient("Сливки", 2);
        recipe.addIngredient("Сахар", 1);

        refrigerator.canCook(recipe);


    }
}
