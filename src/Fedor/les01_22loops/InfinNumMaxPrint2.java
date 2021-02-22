package Fedor.les01_22loops;

import java.util.Scanner;

public class InfinNumMaxPrint2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;

        while (true) {
            System.out.printf("Введите произвольное число: ");
            int inputNum = scanner.nextInt();
            if (inputNum >= maxNum) {
                maxNum = inputNum;
            }
            System.out.printf("Максимальное число:  %d\n", maxNum);
            if(false){ break; }
        }

    }
}



