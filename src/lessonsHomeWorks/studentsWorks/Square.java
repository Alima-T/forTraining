package lessonsHomeWorks.studentsWorks;

public class Square {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void perimeter() {
        System.out.println("Периметр квадрата равен: " + (4 * sideA));
    }

    public void area() {
        System.out.println("Площадь квадрата равна " + Math.pow(sideA, 2) + "\n");
    }
}
