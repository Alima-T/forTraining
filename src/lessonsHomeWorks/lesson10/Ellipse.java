package lessonsHomeWorks.lesson10;

public class Ellipse {
    private double semiAxisR;
    private double semiAxisr;

    public Ellipse(double semiAxisA, double semiAxisB) {
        this.semiAxisR = semiAxisA;
        this.semiAxisr = semiAxisB;
    }

    public void setSemiAxisR(double semiAxisR) {
        this.semiAxisR = semiAxisR;
    }

    public double getSemiAxisR() {
        return semiAxisR;
    }

    public void setSemiAxisr(double semiAxisr) {
        this.semiAxisr = semiAxisr;
    }

    public double getSemiAxisr() {
        return semiAxisr;
    }

    public double ellipseArea() {
        int ellipseArea = (int) (Math.PI * semiAxisR * semiAxisr);
        return ellipseArea;
    }

        public double ellipseLength() {
        int ellipseLength = (int) (Math.PI * (semiAxisR + semiAxisr));
        return ellipseLength;
    }

}



