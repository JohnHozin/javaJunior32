package lesson10;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> winners = new ArrayList<>();


    @Override
    public void addPlayerToGame(Player player) {
        if (players.size() < 9) {
            players.add(player);
        } else {
            System.out.println("Нет свободных мест, простите");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomKart());
            p.addCardToHand(koloda.getRandomKart());
        }
    }

    @Override
    public void dealRestCardToAllPlayers() {
        for (Player p : players) {
            while (p.needCard()) {
                p.addCardToHand(koloda.getRandomKart());
            }
        }
    }

    @Override
    public void printWinners() {

//        int winValue = 21;
//        while (winners.isEmpty()) {
//            for (Player p : players) {
//                if (p.valuesHand() == winValue) {
//                    this.winners.add(p);
//                }
//            }
//            winValue--;
//            if (winValue == 0) {
//                System.out.println("Победил диллер, у всех перебор");
//                return;
//            }
//        }
//        for (Player w : winners) {
//            System.out.println("Победил: " + w.getNamePlayer() + ", у него " + w.valuesHand());
//        }

        // пройдёмся по всем игрокам и "выключим" из списка победителей
        for (Player p:players){
            if (p.valuesHand()>21){
                p.setCanWin(false);
            }
        }

        // если у всех перебор - ищем крупье и говорим что он победитель
        if (countPlayersWhoCanWin() == 0){
            for (Player p:players){
                if (p instanceof Dealer){
                    System.out.println("Победил крупье!!!");
                    p.openHand();
                    return;
                }
            }
        }

        // находим балл победителя
        int valueWinner = 0;
        for (Player p: players){
            if (p.isCanWin() && p.valuesHand()>valueWinner){
                valueWinner=p.valuesHand();
            }
        }

        // находим игроков у которых совпал балл с баллом победителя
        for (Player p: players){
            if (p.valuesHand() == valueWinner){
                System.out.println("Победитель: " + p.getNamePlayer());
                p.openHand();
            }
        }
    }

    public int countPlayersWhoCanWin(){
        int count = 0;
        for (Player p:players){
            if (p.isCanWin()){
                count++;
            }
        }
        return count;
    }
}
