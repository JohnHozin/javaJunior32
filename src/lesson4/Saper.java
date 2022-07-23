package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {

    public static void main(String[] args) {

        System.out.println("Выберете уровень игры:");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;

        if (level.equals("1") || level.equalsIgnoreCase("новичек")) {
            fields = new int[9][9];

            for (int mine = 0; mine < 10; mine++) {
                // добавление одной мины
                SaperUtils.addMine(fields,9,9);
            }

            // печатаем поле с минами
            for (int i = 0; i < fields.length; i++) {
                for (int j = 0; j < fields[i].length; j++) {
                    if (fields[i][j] == -1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fields = new int[16][16];

            for (int mine = 0; mine < 40; mine++) {
                SaperUtils.addMine(fields,16,16);
            }

            for (int i = 0; i < fields.length; i++) {
                for (int j = 0; j < fields[i].length; j++) {
                    if (fields[i][j] == -1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fields = new int[16][30];

            for (int mine = 0; mine < 99; mine++) {

                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(30);
                if (fields[randomRowIndex][randomColIndex] == -1) {
                    mine--;
                } else {
                    fields[randomRowIndex][randomColIndex] = -1;
                }
            }

            for (int i = 0; i < fields.length; i++) {
                for (int j = 0; j < fields[i].length; j++) {
                    if (fields[i][j] == -1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            System.out.println("Ширина поля:");
            String height = scanner.nextLine();
            System.out.println("Высота поля:");
            String width = scanner.nextLine();
            System.out.println("Количество мин");
            String amount = scanner.nextLine();

            fields = new int[Integer.parseInt(height)][Integer.parseInt(width)];
            for (int mine = 0; mine < Integer.parseInt(amount); mine++) {

                int randomRowIndex = ThreadLocalRandom.current().nextInt(Integer.parseInt(height));
                int randomColIndex = ThreadLocalRandom.current().nextInt(Integer.parseInt(width));
                if (fields[randomRowIndex][randomColIndex] == -1) {
                    mine--;
                } else {
                    fields[randomRowIndex][randomColIndex] = -1;
                }
            }

            for (int i = 0; i < fields.length; i++) {
                for (int j = 0; j < fields[i].length; j++) {
                    if (fields[i][j] == -1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }
    }
}


