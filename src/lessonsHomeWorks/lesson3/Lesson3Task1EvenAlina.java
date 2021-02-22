package lessonsHomeWorks.lesson3; // Вывести на консоль все четные числа в обратном порядке.

public class Lesson3Task1EvenAlina {
    public static void main(String[] args) {
        for (int i = 40; i >= 20; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

