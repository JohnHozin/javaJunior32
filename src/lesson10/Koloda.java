package lesson10;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda implements IKoloda{
    ArrayList<Card> cards = new ArrayList<>(); // безразмерный массив с картами

    public Koloda(){
        this.prepareCards();
    }

    public  void prepareCards(){
        cards.add(new Card("Двойка трефа",2));
        cards.add(new Card("Двойка черви",2));
        cards.add(new Card("Двойка пики",2));
        cards.add(new Card("Двойка буби",2));

        cards.add(new Card("Тройка трефа",3));
        cards.add(new Card("Тройка черви",3));
        cards.add(new Card("Тройка пики",3));
        cards.add(new Card("Тройка буби",3));

        cards.add(new Card("Четверка трефа",4));
        cards.add(new Card("Четверка черви",4));
        cards.add(new Card("Четверка пики",4));
        cards.add(new Card("Четверка буби",4));

        cards.add(new Card("Пятерка трефа",5));
        cards.add(new Card("Пятерка черви",5));
        cards.add(new Card("Пятерка пики",5));
        cards.add(new Card("Пятерка буби",5));

        cards.add(new Card("Шестёрка трефа",6));
        cards.add(new Card("Шестёрка черви",6));
        cards.add(new Card("Шестёрка пики",6));
        cards.add(new Card("Шестёрка буби",6));

        cards.add(new Card("Семёрка трефа",7));
        cards.add(new Card("Семёрка черви",7));
        cards.add(new Card("Семёрка пики",7));
        cards.add(new Card("Семёрка буби",7));

        cards.add(new Card("Восьмёрка трефа",8));
        cards.add(new Card("Восьмёрка черви",8));
        cards.add(new Card("Восьмёрка пики",8));
        cards.add(new Card("Восьмёрка буби",8));

        cards.add(new Card("Девятка трефа",9));
        cards.add(new Card("Девятка черви",9));
        cards.add(new Card("Девятка пики",9));
        cards.add(new Card("Девятка буби",9));

        cards.add(new Card("Десятка трефа",10));
        cards.add(new Card("Десятка черви",10));
        cards.add(new Card("Десятка пики",10));
        cards.add(new Card("Десятка буби",10));

        cards.add(new Card("Валет трефа",10));
        cards.add(new Card("Валет черви",10));
        cards.add(new Card("Валет пики",10));
        cards.add(new Card("Валет буби",10));

        cards.add(new Card("Дама трефа",10));
        cards.add(new Card("Дама черви",10));
        cards.add(new Card("Дама пики",10));
        cards.add(new Card("Дама буби",10));

        cards.add(new Card("Король трефа",10));
        cards.add(new Card("Король черви",10));
        cards.add(new Card("Король пики",10));
        cards.add(new Card("Король буби",10));

        cards.add(new Card("Туз трефа",11));
        cards.add(new Card("Туз черви",11));
        cards.add(new Card("Туз пики",11));
        cards.add(new Card("Туз буби",11));
    }
    @Override
    public Card getRandomKart() {
        // дом задание - сделать так чтобы колода уменьшалась и удалялись карты которые мы уже вытянули
        int index = ThreadLocalRandom.current().nextInt(0, cards.size());
        return cards.get(index);
    }
}
