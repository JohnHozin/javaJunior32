package lesson7;

public class Triangle {
    private int a;
    private int b;
    private int c;

    // формула создния конструктора

    /**
     * 1 - модификатор доступа
     * 2 - название класса (это и есть название конструктора)
     * 3 - входящие параметры
     */

    public Triangle() {

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        // a - 7
        // a - мозг
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() {
        return a + b + c;
    }


}
