package lessonsHomeWorks.studentsWorks;

public class Ellipse {
    private double halfAxisR;
    private double halfAxisr;


    public Ellipse(double halfAxisA, double halfAxisB) {
        this.halfAxisR = halfAxisA;
        this.halfAxisr = halfAxisB;

    }

    public double getHalfAxisR() {
        return halfAxisR;
    }

    public void setHalfAxisR(double halfAxisR) {
        this.halfAxisR = halfAxisR;
    }

    public double getHalfAxisr() {
        return halfAxisr;
    }

    public void setHalfAxisr(double halfAxisr) {
        this.halfAxisr = halfAxisr;
    }

    public void perimeter() {
        double res = (Math.PI * halfAxisR * halfAxisr + Math.pow(halfAxisR - halfAxisr, 2)) / (halfAxisR + halfAxisr) * 4;

        System.out.println("Периметр овала равен " + res);


    }

    public void area() {
        double res = Math.PI*halfAxisR*halfAxisr;
        System.out.println("Площадь овала равна: " + res + "\n");


    }
}

