package lesson19;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 1200, 900, 231, 4.8,30);
        Tovar tovar2 = new Tovar("Мышка!!!", 1200, 900, 231,4.9,2);
        Tovar tovar3 = new Tovar("Ноутбук", 89900, 79900, 43,3.7,0);
        Tovar tovar4 = new Tovar("Клавиатура", 1900, 900, 54,4.0,10);
        Tovar tovar5 = new Tovar("Микрофон", 10200, 9000, 78,2.5,7);
        Tovar tovar6 = new Tovar("Клавиатура", 2200, 2100, 78,2.5,7);
        Tovar tovar7 = new Tovar("Ноутбук", 50200, 49000, 278,4.5,37);
        Tovar tovar8 = new Tovar("Ноутбук", 89900, 79900, 178,5.0,107);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);
        tovars.add(tovar7);
        tovars.add(tovar8);

        System.out.println("---- сортировка по цене от меньшего к большему ----");
        for (Tovar t: tovars) {
            System.out.println(t);
        }

        TypesOfSortTovar.printTovarsByPriceFromTo(tovars);
        TypesOfSortTovar.printTovarsByPopylar(tovars);
        TypesOfSortTovar.printTovarsByDifferentSellPrice(tovars);
        TypesOfSortTovar.printTovarsByPercentSellPrice(tovars);
        TypesOfSortTovar.printTovarsByReview(tovars);
        TypesOfSortTovar.printTovarsByStar(tovars);
    }
}
