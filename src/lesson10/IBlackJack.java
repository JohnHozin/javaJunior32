package lesson10;

public interface IBlackJack {

    void addPlayerToGame(Player player);

    void dealTwoCardsToAllPlayers();

    void dealRestCardToAllPlayers();

    void printWinners();
}
