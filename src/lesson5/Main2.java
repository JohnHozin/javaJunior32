package lesson5;

public class Main2 {
    public static void main(String[] args) {
        //
        MathOperations.printTypeOfTriangle(2, 4, 5);
        MathOperations.printTypeOfTriangle(4, 4, 4);
        MathOperations.printTypeOfTriangle(4, 4, 7);

        double ploshad1 = MathOperations.printPloshOfTriangle(2, 4, 3);
        double ploshad2 = MathOperations.printPloshOfTriangle(4,6);

        if (ploshad1 > ploshad2) {
            System.out.println("Первый треугольник больше!");
        } else if (ploshad1 < ploshad2) {
            System.out.println("Второй треугольник больше!");
        } else {
            System.out.println("Треугольники равны!");
        }
    }
}
