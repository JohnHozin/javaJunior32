package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *  Мы - турагенство
         *  Программа отображает правильный набор туров в зависимости от
         *  потребности человека
         */

        String[][] tours = {
                {"1", "Италия", "5 дней", "самолёт", "5 звезд", "120000", "полупансионат"},
                {"2", "Франция", "7 дней", "самолёт", "4 звезд", "150000", "завтрак"},
                {"3", "Грузия, Армения", "10 дней", "автобус", "4 звезд", "80000", "пансионат"},
                {"4", "Армения", "12 дней", "автобус", "3 звезд", "120000", "завтрак"},
                {"5", "Турция", "13 дней", "самолёт", "5 звезд", "90000", "полупансионат"},
                {"6", "Турция, Болгария", "13 дней", "автобус", "5 звезд", "130000", "полупансионат"},
                {"7", "Италия, Франция", "6 дней", "автобус", "5 звезд", "150000", "полупансионат"},
                {"8", "Италия", "7 дней", "самолёт", "5 звезд", "140000", "завтрак"},
                {"9", "Мальдивы", "9 дней", "самолёт", "4 звезд", "130000", "пансионат"},
                {"10", "Мальта", "12 дней", "самолёт", "4 звезд", "130000", "пансионат"},
                {"11", "Мальта", "14 дней", "самолёт", "5 звезд", "150000", "полупансионат"}};

        System.out.println("Добрый день, выберете действие: ");

        System.out.println("1 - Узнать среднюю стоимость тура в определённую страну");
        System.out.println("2 - Узнать среднюю стоимость любого тура");
        System.out.println("3 - Вывести туры в определённую страну");
        System.out.println("4 - Вывести туры ценой ОТ и ДО");
        System.out.println("5 - Вывести туры +- 2 дня от введённой длительности в определённую страну");
        System.out.println("6 - Вывести выгодные туры (выгодными считаются туры со стоимостью ДО 10т в день)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость в " + country + " = " + averagePrice);

        } else if (answer.equals("2")) {
            int allPrice = 0;
            for (int i = 0; i < tours.length; i++) {
                allPrice += Integer.parseInt(tours[i][5]);
            }
            System.out.println("Средняя стоимость тура: " + allPrice / tours.length);

        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ": ");
            TourUtils.printToursByCountry(tours, country);

        } else if (answer.equals("4")) {
            System.out.println("Введите минимальную цену тура:");
            int priceMin = scanner.nextInt();
            System.out.println("Введите максимальную цену тура:");
            int priceMax = scanner.nextInt();
            for (int i = 0; i < tours.length; i++) {
                if (Integer.parseInt(tours[i][5]) >= priceMin && Integer.parseInt(tours[i][5]) <= priceMax) {
                    TourUtils.printTour(tours, i);
                }
            }

        } else if (answer.equals("5")) {
            System.out.println("Введите желаемое количество дней тура:");
            int numberOfDay = scanner.nextInt();
            for (int i = 0; i < tours.length; i++) {
                String toursDay = tours[i][2];
                toursDay = toursDay.replace(" дней", "");
                if (Integer.parseInt(toursDay) >= numberOfDay - 2 && Integer.parseInt(toursDay) <= numberOfDay + 2) {
                    TourUtils.printTour(tours, i);
                }
            }

        } else if (answer.equals("6")) {
            System.out.println("Выгодные туры:");
            for (int i = 0; i < tours.length; i++) {
                String toursDay = tours[i][2];
                toursDay = toursDay.replace(" дней", "");
                if (Integer.parseInt(tours[i][5])/Integer.parseInt(toursDay) <= 10000) {
                    TourUtils.printTour(tours, i);
                }
            }

        } else
            System.out.println("Неверно! ");
            main(args);
    }
}
