package lessons.lesson10;

public class Main1 {
    public static void main(String[] args) {
        Triangle figure = new Triangle();
        figure.setA(3);
        figure.setB(5);
        figure.setC(7);
        int perimterFigure= figure.perimeter();

        Triangle figure1 = new Triangle(3,5,7);
        int perimterFigure1 = figure1.perimeter();
        System.out.println(perimterFigure);
        System.out.println(perimterFigure1);
    }
}
