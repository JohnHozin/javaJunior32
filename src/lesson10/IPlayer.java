package lesson10;

public interface IPlayer {

    /**
     * Интерфейс - набросок будущего класса
     * 1) правило: объект данного интерфейса создать нельзя
     * 2) все методы не имеют тела, т.е. являются якобы
     * наброском того, что должно быть внутри класса
     * 3)
     */

    void addCardToHand(Card card);

    boolean needCard();

    void openHand();

    void setName(String name);

    String getNamePlayer();
}
