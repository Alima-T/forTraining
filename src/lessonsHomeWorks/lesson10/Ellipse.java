package lessonsHomeWorks.lesson10;

public class Ellipse {
    private String name;
    private int semiAxis;


    public void setName(String name) {
        this.name = name;
    }

    public void setSemiAxis(int semiAxis) {
        this.semiAxis = semiAxis;
    }

    public String getName() {
        return name;
    }

    public int getSemiAxis() {
        return semiAxis;

    }

    public double ellipseLength(int semiAxis1, int semiAxis2) {
        double L = (int) (Math.PI * (semiAxis1 + semiAxis2));
        return L;
    }

    public double ellipseArea(int semiAxis1, int semiAxis2) {
        double S =  Math.PI * semiAxis1 * semiAxis2;
        return S;
    }
}



