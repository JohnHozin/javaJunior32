package lesson7.homeWork;

public class Square {
    private int a;

    public Square() {

    }

    public Square(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public int perimeter() {
        return 4 * this.a;
    }

    public int area() {
        return this.a * this.a;
    }

}
