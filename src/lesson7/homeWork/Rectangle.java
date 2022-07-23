package lesson7.homeWork;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int perimeter() {
        return 2 * this.a + 2 * this.b;
    }

    public int area() {
        return this.a * this.b;
    }

}
