package lessonsHomeWorks.studentsWorks;

public class Circle {
    private double diameter;
    private double radius;

    public Circle(double diameter, double radius){
        this.diameter= diameter;
        this.radius=radius;


    }
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void perimeter(){
        System.out.println("Периметр круга равен " + (Math.PI * diameter));
    }
    public void area(){
        System.out.println("Площадь круга равна: " + (Math.PI * Math.pow(radius,2))+ "\n");

    }

}


