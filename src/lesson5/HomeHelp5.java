package lesson5;

import java.util.Scanner;

public class HomeHelp5 {
    public static void metod1() {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replaceAll("[^aeiouyаеёиоуэюяAEIOUYАЕЁИОУЭЮЯ]", "");
        System.out.println("1) В тексте гласных: " + text.length());
    }

    public static void metod2() {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String reverceText = new StringBuffer(text).reverse().toString();
        System.out.println("2) Текст задом наперёд: " + reverceText);
    }

    public static void metod3() {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replaceAll("[^.,]", "");
        System.out.println("3) В тексте знаков пунктуации: " + text.length());
    }

    public static void metod4() {
        System.out.println("Введите количество строк:");
        Scanner scanner1 = new Scanner(System.in);
        String strok = scanner1.nextLine();
        int intStrok = Integer.parseInt(strok);

        System.out.println("Введите количество столбцов:");
        Scanner scanner2 = new Scanner(System.in);
        String stolb = scanner2.nextLine();
        int intStolb = Integer.parseInt(stolb);

        for (int i = 0; i < intStrok; i++) {
            for (int j = 0; j < intStolb; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    public static void metod5() {
        System.out.println("Введите первое число:");
        Scanner scanner1 = new Scanner(System.in);
        String number1 = scanner1.nextLine();
        int intNumber1 = Integer.parseInt(number1);

        System.out.println("Введите второе число:");
        Scanner scanner2 = new Scanner(System.in);
        String number2 = scanner2.nextLine();
        int intNumber2 = Integer.parseInt(number2);

        System.out.println("Введите третье число:");
        Scanner scanner3 = new Scanner(System.in);
        String number3 = scanner3.nextLine();
        int intNumber3 = Integer.parseInt(number3);

        if (intNumber1 <= intNumber2 && intNumber1 <= intNumber3) {
            System.out.println("5) Самое меньшее число: " + intNumber1);
        } else if (intNumber2 <= intNumber1 && intNumber2 <= intNumber3) {
            System.out.println("5) Самое меньшее число: " + intNumber2);
        } else {
            System.out.println("5) Самое меньшее число: " + intNumber3);
        }
    }

    public static void metod6() {
        System.out.println("Введите сумму депозита:");
        Scanner scanner1 = new Scanner(System.in);
        String summa = scanner1.nextLine();
        double summa1 = Double.parseDouble(summa);

        System.out.println("Введите банковский процент:");
        Scanner scanner2 = new Scanner(System.in);
        String parcent = scanner2.nextLine();
        double parcent1 = Double.parseDouble(parcent);

        System.out.println("Введите количество лет:");
        Scanner scanner3 = new Scanner(System.in);
        String years = scanner3.nextLine();
        double years1 = Double.parseDouble(years);

        System.out.println("6) Прирост по процентам составил: " + (summa1 * parcent1 * 0.01 * years1));
    }

    public static void metod7() {
        System.out.println("Введите email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        String[] partsOfEmail = email.split("@");
        String[] partsOfEmailDot = partsOfEmail[1].split("\\.");

        if (partsOfEmail.length == 2 && !email.contains(" ") && partsOfEmailDot.length == 2) {
            System.out.println("7) Email подходит!");
        } else {
            System.out.println("7) Email не подходит!");
        }
    }
}
