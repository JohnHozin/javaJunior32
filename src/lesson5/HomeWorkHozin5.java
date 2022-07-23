package lesson5;

import java.util.Scanner;

public class HomeWorkHozin5 {
    /**
     * //     Создать методы:
     * //     1) Метод принимает входящими параметрами текст,
     * //     и возвращает кол-во гласных букв в тексте
     * //     2) Метод принимает входящими параметрами текст,
     * //     печатает на консоль этот же текст, только в обратном порядке
     * //     3) Метод принимает входящими параметрами текст,
     * //     и печатает на консоль сколько в тексте знаков пунктуации
     * //     4) В метод передаем кол-во строк и кол-во колонок,
     * //     метод печатает на консоль квадрат из единичек по этим параметрам
     * //     5) В метод передаем 3 числа, метод должен вернуть меньшее число из 3х
     * //     6) В метод передаем сумму депозита, банковский процент и кол-во лет,
     * //     и метод возвращает значение прироста процентов которые мы заберем с
     * //     банка через столько лет
     * //     7) В метод передаем email, метод должен вернуть true или false
     * //     подходит нам email или нет. Подходит: когда содержит @, когда нет
     * //     пробелов, когда часть текста после @ содержит в себе точку
     */

    public static void main(String[] args) {

        System.out.println("Выберете метод (от 1 до 7):");
        Scanner scanner = new Scanner(System.in);
        String metodSearch = scanner.nextLine();
        if (metodSearch.equals("1")) {
            HomeHelp5.metod1();
        } else if (metodSearch.equals("2")) {
            HomeHelp5.metod2();
        } else if (metodSearch.equals("3")) {
            HomeHelp5.metod3();
        } else if (metodSearch.equals("4")) {
            HomeHelp5.metod4();
        } else if (metodSearch.equals("5")) {
            HomeHelp5.metod5();
        } else if (metodSearch.equals("6")) {
            HomeHelp5.metod6();
        } else if (metodSearch.equals("7")) {
            HomeHelp5.metod7();
        } else {
            System.out.print("Неверно! ");
            main(args);
        }
    }
}
