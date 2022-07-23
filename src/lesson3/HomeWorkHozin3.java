package lesson3;

import java.util.Objects;
import java.util.stream.IntStream;

public class HomeWorkHozin3 {
    public static void main(String[] args) {
        /**
         * Домашнее задание на среду:
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 1) Сколько в массиве четных цифр?
         * 2) Все числа с массива, которые больше 10, но меньше 25.
         * 3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трем.
         * 4) ***Только те числа, которые содержат в себе символ 4 (не для всех)
         */

        int numbers[] = {2, 4, 45, 3, 64, 3, 5, 345, 4, 5, 74, 54, 23, 65, 3, 43, 345, 45, 45, 457, 45, 234, 2, 21, 12, 312, 4, 879, 567, 22, 15};
        int chet = 0;

        System.out.print("1) >10 & <25: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                chet++;
            }
            if (numbers[i] > 10 && numbers[i] < 25) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("2) Чётных: " + chet);

        System.out.print("3) ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("4) ");
        String[] numberStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberStr[i] = String.valueOf(numbers[i]);
            if (numberStr[i].contains("4")) {
                System.out.print(numberStr[i] + " ");
            }
        }
    }
}
