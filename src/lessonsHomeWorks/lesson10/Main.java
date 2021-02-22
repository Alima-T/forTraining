package lessonsHomeWorks.lesson10;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6.5);
        System.out.printf("При радиусе равном %s, длина окружности круга = %s, a его площадь = %s \n", circle.getRadius(), circle.circleLength(), circle.circleArea());

        Ellipse ellipse=new Ellipse(7,6); // в методах double явно приведен к int
        System.out.printf("При величине полуосей R = %s и r = %s, длина окружности эллипса = %s, a ее площадь = %s \n", ellipse.getSemiAxisR(), ellipse.getSemiAxisr(), ellipse.ellipseLength(), ellipse.ellipseArea());

        Square square = new Square(5);
        System.out.printf("При сторное равной %s, периметр квадарата = %s, a его площадь = %s \n", square.getSide(), square.squarePerimeter(), square.squareArea());

        Rectangle rectangle =new Rectangle(4,5);
        System.out.printf("При сторное A = %s, и стороне В = %s, периметр прямоугольника = %s, a его площадь = %s \n", rectangle.getSide1(), rectangle.getSide2(),rectangle.perimeter(),rectangle.area());

    }
}
