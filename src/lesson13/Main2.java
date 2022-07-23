package lesson13;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5,1998,5,"железо");
        Coin coin2 = new Coin(5,1998,5,"железо");
        Coin coin3 = new Coin(6,1967,4,"серебро");
        Coin coin4 = new Coin(8,2000,3,"олово");
        Coin coin5 = new Coin(3,2007,5,"железо");

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c:coins){
            System.out.println(c);
        }

    }
}
