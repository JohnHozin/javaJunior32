package lesson7.homeWork;

public class Main {

    public static void main(String[] args) {


        /**
         * 1) Создать классы: Круг, Квадрат, Прямоугольник. Определить в них все нужные переменные,
         * написать в них удобные для нас конструкторы, написать все методы set и все методы get.
         * Добавить в данные классы методы -площадь и -перимерт
         * 2) Создать Main, в нем создать по одному объекту каждого типа. Вызвать к каждому объекту
         * методы площадь и перимерт, и обязательно проверить результат просчета ваших методов через
         * онлайн калькулятор этих фигур
         */

        Circle circle1 = new Circle(6);
        System.out.println("Длина окружности равна: " + circle1.circumference());
        System.out.println("Площадь окружности равна: " + circle1.area() + "\n");


        Rectangle rectangle1 = new Rectangle(2, 5);
        System.out.println("Периметр прямоугольника равен: " + rectangle1.perimeter());
        System.out.println("Площадь прямоугольника равна: " + rectangle1.area() + "\n");

        Square square1 = new Square(3);
        System.out.println("Периметр квадрата равен: " + square1.perimeter());
        System.out.println("Площадь квадрата равна: " + square1.area() + "\n");

    }
}
