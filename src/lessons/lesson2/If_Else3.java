package lessons.lesson2;

public class If_Else3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 4;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
