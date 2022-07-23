package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needCard() {
        this.openHand();
        System.out.println("Нужна ли ещё одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да") || answer.equals("+")) {
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        System.out.println("------- ВАШИ КАРТЫ  " + this.name);
        System.out.println("Очков: " + this.valuesHand());
        for (Card c : hand) {
            System.out.println(c.getName());
        }
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNamePlayer() {
        return this.name;
    }

    public int valuesHand() {
        int values = 0;
        for (Card c : hand) {
            values = values + c.getValue();
        }
        return values;
    }
}
