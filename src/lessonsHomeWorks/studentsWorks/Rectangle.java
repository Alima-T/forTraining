package lessonsHomeWorks.studentsWorks;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle (double sideA, double sideB){
        this.sideA=sideA;
        this.sideB = sideB;

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void perimeter(){
        System.out.println("Периметр прямоугольника равен: " + (2*(sideA+sideB)));
    }
    public void area(){
        System.out.println("Площадь прямоугольника равна " + (sideA * sideB)+ "\n");

    }
}
