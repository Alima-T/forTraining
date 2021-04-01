package lessons.lesson11_2;

public class ForSidesFigure {
    private int a;
    private int b;
    private int c;
    private int d;

    public void forSidesFigure(int a, int b, int c, int d) {

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

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int perimeter() {
        return (a + b + c + d) / 2;
    }

    @Override
    public String toString() {
        return "ForSidesFigure{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
