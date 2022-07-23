package lesson7.homeWork;

public class Circle {
    private int r;

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return this.r;
    }

    public double circumference() {
        return 2 * Math.PI * this.r;
    }

    public double area() {
        return Math.PI * this.r * this.r;
    }

}
