package lessonsHomeWorks.lesson2;

public class Les2FindHighestNumAndQuadrangleRedo {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 210;
        int d = 2;

        if (a > b && a > c && a > d) {
            System.out.printf("The highest number is: %s. \n", a);
        } else if (b > a && b > c && b > d) {
            System.out.printf("The highest number is: %s. \n", b);
        } else if (c > a && c > b && c > d) {
            System.out.printf("The highest number is: %s. \n", c);
        } else {
            System.out.printf("The highest number is: %s. \n", d);

        }
        System.out.println(" ");

        int a1 = 30;
        int b1 = 10;
        int c1 = 30;
        int d1 = 10;

        if (a1 == b1 && b1 == c1 && c1 == d1 && d1 == a1) {
            System.out.println("This is a Square or a Rhombus.");

        } else if (a1 == b1 && c1 == d1 || a1 == d1 && b1 == c1) {
            System.out.println("This is a Kite");

        } else if (a1 == c1 && b1 == d1) {
            System.out.println("This is a Rectangle or a Parallelogram.");

        } else {
            System.out.println("This is an irregular quadrangle.");
        }
        System.out.println(" ");
    }

}


