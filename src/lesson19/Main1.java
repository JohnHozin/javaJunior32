package lesson19;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 1200, 900, 231);
        Tovar tovar2 = new Tovar("Мышка", 1200, 900, 231);
        Tovar tovar3 = new Tovar("Ноутбук", 89900, 79900, 43);
        Tovar tovar4 = new Tovar("Клавиатура", 1900, 900, 54);
        Tovar tovar5 = new Tovar("Микрофон", 10200, 9000, 78);

        HashSet<Tovar> tovars = new HashSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar t: tovars) {
            System.out.println(t);
        }
    }
}
