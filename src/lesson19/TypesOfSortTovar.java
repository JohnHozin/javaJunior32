package lesson19;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TypesOfSortTovar {

    public static void printTovarsByPriceFromTo(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new SortByPriceFromTo());
        sorted.addAll(tovars);

        System.out.println("---- сортировка по цене от большего к меньшему ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByPopylar(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getStar() != o2.getStar()){
                    return (int) (10*(o2.getStar() - o1.getStar()));
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if (!o1.getName().equals(o2.getName())){
                    return o2.getName().compareTo(o1.getName());
                }
                if (o1.getReview() != o2.getReview()){
                    return o1.getReview() - o2.getReview();
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("---- сортировка по популярности от большего к меньшему ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByDifferentSellPrice(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if ((o1.getPrice() - o1.getSalePrice()) != (o2.getPrice() - o2.getSalePrice())){
                    return (o2.getPrice() - o2.getSalePrice()) - (o1.getPrice() - o1.getSalePrice());
                }
                if (o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if (o1.getStar() != o2.getStar()){
                    return (int) (10*(o2.getStar() - o1.getStar()));
                }
                if (o1.getReview() != o2.getReview()){
                    return o1.getReview() - o2.getReview();
                }
                if (!o1.getName().equals(o2.getName())){
                    return o2.getName().compareTo(o1.getName());
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("---- сортировка по скидке от большего к меньшему ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }


    public static void printTovarsByPercentSellPrice(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if ((o1.getPrice() - o1.getSalePrice()) != (o2.getPrice() - o2.getSalePrice())){
                    double d1 = (double) (o1.getPrice() - o1.getSalePrice()) / o1.getPrice();
                    double d2 = (double) (o2.getPrice() - o2.getSalePrice()) / o2.getPrice();
                    return (int) ((d2-d1)*1000000);
                }
                if (o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if (o1.getStar() != o2.getStar()){
                    return (int) (10*(o2.getStar() - o1.getStar()));
                }
                if (o1.getReview() != o2.getReview()){
                    return o1.getReview() - o2.getReview();
                }
                if (!o1.getName().equals(o2.getName())){
                    return o2.getName().compareTo(o1.getName());
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("---- сортировка по скидке (%) от большего к меньшему ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByReview(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.getReview() != o2.getReview()){
                    return o2.getReview() - o1.getReview();
                }
                if (o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if (!o1.getName().equals(o2.getName())){
                    return o2.getName().compareTo(o1.getName());
                }
                if (o1.getStar() != o2.getStar()){
                    return (int) (10*(o2.getStar() - o1.getStar()));
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("---- сортировка по обсуждаемости (отзывы) от большего к меньшему ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }

    public static void printTovarsByStar(SortedSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.getStar() != o2.getStar()){
                    return (int) (110*(o2.getStar() - o1.getStar()));
                }
                if (o1.getBuyCount() != o2.getBuyCount()){
                    return o2.getBuyCount() - o1.getBuyCount();
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getSalePrice() != o2.getSalePrice()){
                    return o2.getSalePrice() - o1.getSalePrice();
                }
                if (!o1.getName().equals(o2.getName())){
                    return o2.getName().compareTo(o1.getName());
                }
                if (o1.getReview() != o2.getReview()){
                    return o1.getReview() - o2.getReview();
                }
                return 0;
            }
        });
        sorted.addAll(tovars);

        System.out.println("---- сортировка по оценке (рейтинг) от большей к меньшей ----");
        for (Tovar t:sorted){
            System.out.println(t);
        }
    }
}
