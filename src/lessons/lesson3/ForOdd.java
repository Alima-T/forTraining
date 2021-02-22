package lessons.lesson3;

public class ForOdd {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 > 0 && i > 0) {
                System.out.println(i);
            }
        }
    }
}
