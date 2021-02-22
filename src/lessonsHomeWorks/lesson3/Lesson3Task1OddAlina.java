package lessonsHomeWorks.lesson3; // Вывести на консоль все нечетные числа в обратном порядке.

public class Lesson3Task1OddAlina {
    public static void main(String[] args) {
        for (int i = 40; i >= 20; i--) {
            if (i % 2 > 0) {
                System.out.println(i);
            }
        }
    }
}



        //(i % 2 > 0 && i != 0) - избыточно