package lessonsHomeWorks.lesson10;

public class Circle {
    private String name;
    private int radios;

    public void setName(String name) {
        this.name = name;
    }

    public void setRadios(int radios) {
        this.radios = radios;
    }

    public double figureLength(int radios) {
        double L = 2 * Math.PI * radios;
        return L;

    }

    public double circleArea(int radios) {
        double S = Math.PI * pow(radios);
        return S;
    }

    public int pow(int value) {
        return value * value;

    }
}
