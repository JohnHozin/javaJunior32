package lesson5;

public class MathOperations {

    /**
     * Создать метод, в который мы передаём 3 стороны треугольника,
     * а метод будет печатать на консоль какой это вид треугольника
     */

    /**
     * 1 - модификатор доступа (регулировка области видимости данного метода)
     * public - доступ внутри всего проекта
     * private - доступ внутри текущего файла
     * ______ - доступ внутри текущего пакета (папки) и  наследникам данного файла
     * protected - доступ внутри текущего файла и наследникам данного файла
     * <p>
     * 2 - static (или есть или нет)
     * 3 - возвращаемый тип (void или тип)
     * 4 - название метода
     * 5 - входящие параметры
     * 6 - тело выполнения метода
     */

    public static void printTypeOfTriangle(int a, int b, int c) {
        // 3  5  6      6 5 6     4 3 12
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Такого треугольника не существует!");
            return;
        }

        if (a == b && b == c && c == a) {
            System.out.println("равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("разносторонний треугольник");
        } else {
            System.out.println("равнобедренный треугольник");
        }
    }

    /**
     * в метод мы передаём 3 стороны треугольника
     * и метод возвращается значение площади треугольника
     */

    public static double printPloshOfTriangle(double a, double b, double c) {
        double s = Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) *
                ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
        return s;
    }

    public static double printPloshOfTriangle(int osnovanie, int visota) {
        double s = 0.5 * osnovanie * visota;
        return s;
    }
}

