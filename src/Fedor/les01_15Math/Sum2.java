package Fedor.les01_15Math;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int inputNum1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int inputNum2 = scanner.nextInt();

        System.out.println("Введите третье число");
        int inputNum3 = scanner.nextInt();

        int sum = inputNum1 + inputNum2 + inputNum3;
        System.out.println(sum);
    }
}
