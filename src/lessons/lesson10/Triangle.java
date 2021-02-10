package lessons.lesson10;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() { // первый конструктор всегда пустой, остальные называются также, но отличаются параметрами

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Triangle(int a) { // равнобедренный
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {  // периметр
        return a + b + c;

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
