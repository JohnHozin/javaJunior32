package lesson19;

import java.util.Comparator;

public class SortByPriceFromTo implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {
        // o1 - первый товар
        // o2 - аторой товар

        if (o1.getPrice() != o2.getPrice()){
            return o2.getPrice() - o1.getPrice();
        }
        if (o1.getSalePrice() != o2.getSalePrice()){
            return o2.getSalePrice() - o1.getSalePrice();
        }
        if (o1.getBuyCount() != o2.getBuyCount()){
            return o2.getBuyCount() - o1.getBuyCount();
        }
        if (!o1.getName().equals(o2.getName())){
            return o2.getName().compareTo(o1.getName());
        }
        if (o1.getStar() != o2.getStar()){
            return (int) (10*(o2.getStar() - o1.getStar()));
        }
        if (o1.getReview() != o2.getReview()){
            return o1.getReview() - o2.getReview();
        }
        return 0;
    }
}
