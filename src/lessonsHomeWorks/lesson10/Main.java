package lessonsHomeWorks.lesson10;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setRadios(20);

        double circleLength1 = circle.figureLength(20);
        System.out.println(circleLength1);

        double cirleArea1=circle.circleArea(20);
        System.out.println(cirleArea1);


        Ellipse ellipse=new Ellipse();
        ellipse.setName("Ellipse");
        ellipse.setSemiAxis(10);

        double ellipselengh1 = ellipse.ellipseLength(10,20);
        System.out.println(ellipselengh1);

        double ellipseArea1 = ellipse.ellipseArea(10,20);
        System.out.println(ellipseArea1);

    }
}
