package lesson10;

public class Dealer extends Player {
    @Override
    public boolean needCard() {
        if (valuesHand() < 17) {
            return true;
        }
        return false;
    }
}
