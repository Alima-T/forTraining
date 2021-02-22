package lessonsHomeWorks.studentsWorks;

public class Main {
    public static void main(String[] args) {
        Ellipse elipse = new Ellipse(10,5);
        System.out.printf("Овал с параметрами R= %f r= %f \n",elipse.getHalfAxisR(), elipse.getHalfAxisr());
        elipse.perimeter();
        elipse.area();
        elipse.setHalfAxisR(20);
        elipse.setHalfAxisr(10);
        System.out.printf("Овал с параметрами R= %f r= %f \n",elipse.getHalfAxisR(), elipse.getHalfAxisr());
        elipse.perimeter();
        elipse.area();

        Circle circle = new Circle(10,5);
        circle.perimeter();
        circle.area();
        Square square = new Square(10);
        square.perimeter();
        square.area();
        Rectangle rectangle = new Rectangle(10,5);
        rectangle.perimeter();
        rectangle.area();
    }
}


