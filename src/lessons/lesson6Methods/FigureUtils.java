package lessons.lesson6Methods;

public class FigureUtils {
    public static double squareTriangle(int a, int b, int c ) {  // если не void, то обязательно указать return значение double or int
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
