package lessons.lesson20;

import java.io.Serializable;

public class Point implements Serializable {

    private int x = 0, y = 0;

    public Point() {    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}


