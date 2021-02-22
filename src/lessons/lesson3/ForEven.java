package lessons.lesson3; // Вывести на консоль все четные числа в обратном порядке.

public class ForEven {
    public static void main(String[] args) {
        for (int i = 40; i >= 20; i--) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}

