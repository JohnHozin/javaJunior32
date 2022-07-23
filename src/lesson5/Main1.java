package lesson5;

public class Main1 {
    public static void main(String[] args) {
        /**
         * дз из 3 урока
         */

        int[] numbers = {3, 5, 6, 8, 4, 6, 8, 44, 234};

        for (int i = 0; i < numbers.length; i++) {
            // 3     "3"
            String curentNumFromMassive = Integer.toString(numbers[i]);

            // "3"
            // dhdj4   234     e4e4e4   skdfds
            int startIndex4 = curentNumFromMassive.indexOf('4');
            if (startIndex4 != -1) {
                System.out.println(curentNumFromMassive);
            }
        }
    }
}
