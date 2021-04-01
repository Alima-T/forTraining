package GeekBrains;

import java.util.Scanner;

public class GameGuessNumber {
    private static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        // вариант 3:
        System.out.println("Ваша задача угадать число");
        for (int i = 10; i <= 30; i = i + 10) playLevel(i); // облегчили цикл переносом random в метод, убираем переменную number из параметров метода

        scanner.close();//поскольку сканнер при создании выделяет ресурсы, то по окончании работы необходимо их освободить
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.printf("Угадайте число от 0 до %d \n", range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Вы угадали");
                break;
            } else if (inputNumber > number) {
                System.out.println("Загадонное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }

        // вариант 1:
//    System.out.println("Ваша задача угадать число");
//        int range = 10;
//        int number = (int) (Math.random() * range);
//        playLevel(range, number);

        // Вариант 2
        //усложняем игру уровнями
//    System.out.println("Ваша задача угадать число");
//        for (int i = 10; i <= 30; i = i + 10) {
//            int number = (int) (Math.random() * i);
//            playLevel(i, number);


//    private static void playLevel(int range, int number) {
//
//        while (true) {
//            System.out.printf("Угадайте число от 0 до %d \n", range);
//            int inputNumber = scanner.nextInt();
//            if (inputNumber == number) {
//                System.out.println("Вы угадали");
//                break;
//            } else if (inputNumber > number) {
//                System.out.println("Загадонное число меньше");
//            } else {
//                System.out.println("Загаданное число больше");
//            }
//        }
//    }
}
