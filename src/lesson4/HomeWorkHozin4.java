package lesson4;

public class HomeWorkHozin4 {
    public static void main(String[] args) {

        int[][] numbers = new int[21][21];

        // 1 задание
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((i - j <= numbers.length / 2) && (i - j >= -numbers.length / 2) &&
                        (i + j >= numbers.length / 2) && (i + j < (numbers.length + numbers.length / 2))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 2 вариант 1 задания

        int b = numbers.length / 2;
        int c = b;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(j > b || j < c ? "* " : "- ");
            }
            System.out.println();
            if (i < numbers.length / 2) {
                b++;
                c--;
            } else {
                b--;
                c++;
            }
        }
        System.out.println();

        // 3 задание
        int m = numbers.length / 2;
        int n = m;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(j > m || j < n ? "- " : "* ");
            }
            System.out.println();
            if (i < numbers.length / 2) {
                m++;
                n--;
            } else {
                n = numbers.length;
            }
        }
        System.out.println();

        // 4 задание
        int[][] num = new int[20][20];
        int x = num.length / 2;
        int y = x - 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(j <= x && j >= y ? "0 " : "* ");
            }
            System.out.println();
            if (i < num.length / 2 - 1) {
                x++;
                y--;
            } else if (i >= (num.length / 2)) {
                x--;
                y++;
            }
        }
        System.out.println();
    }

}
