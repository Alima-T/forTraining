package lessonsHomeWorks.lesson10;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public void setRadius() {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double circleLength() {
        double circlelength = 2 * Math.PI * radius;
        return circlelength;

    }

    public double circleArea() {
        double area = Math.PI * pow(radius); // или (Math.PI * Math.pow(radius,2))
        return area;
    }

    public double pow(double value) {
        return value * value;

    }
}
