package lessonsHomeWorks.lesson10;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int squarePerimeter() {
        int perimeter = 4 * side;
        return perimeter;
    }

    public int squareArea() {
        int area = (int) Math.pow(side, 2);
        return area;
    }
}
