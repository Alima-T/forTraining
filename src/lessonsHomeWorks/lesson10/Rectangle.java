package lessonsHomeWorks.lesson10;

public class Rectangle {
    private int side1;
    private int side2;

    public Rectangle(int a, int b) {
        this.side1 = a;
        this.side2 = b;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int perimeter() {
        int perimeter = 2 * (side1 + side2);
        return perimeter;
    }

    public int area() {
        int area = side1 * side2;
        return area;
    }
}
