package lesson7.tours;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1, 5, "самолёт", 5, 120000, "полупансионат");
        Tour tour2 = new Tour(2, 7, "самолёт", 4, 150000, "завтрак");
        Tour tour3 = new Tour(3, 10, "автобус", 4, 80000, "пансионат");
        Tour tour4 = new Tour(4, 12, "автобус", 3, 120000, "завтрак");
        Tour tour5 = new Tour(5, 13, "самолёт", 5, 90000, "полупансионат");
        Tour tour6 = new Tour(6, 13, "автобус", 5, 130000, "полупансионат");
        Tour tour7 = new Tour(7, 6, "автобус", 5, 150000, "полупансионат");
        Tour tour8 = new Tour(8, 7, "самолёт", 5, 140000, "завтрак");
        Tour tour9 = new Tour(9, 9, "самолёт", 4, 130000, "пансионат");
        Tour tour10 = new Tour(10, 12, "самолёт", 4, 130000, "пансионат");
        Tour tour11 = new Tour(11, 14, "самолёт", 5, 150000, "полупансионат");

        tour1.addCountry("Италия");
        tour2.addCountry("Франция");
        tour3.addCountry("Грузия");
        tour3.addCountry("Армения");
        tour4.addCountry("Армения");
        tour5.addCountry("Турция");
        tour6.addCountry("Турция");
        tour6.addCountry("Болгария");
        tour7.addCountry("Италия");
        tour7.addCountry("Франция");
        tour8.addCountry("Италия");
        tour9.addCountry("Мальдивы");
        tour10.addCountry("Мальта");
        tour11.addCountry("Мальта");
        System.out.println();


    }
}
