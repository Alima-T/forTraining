package Fedor.les01_20IfElseWhile;

import java.util.Scanner;

public class MaxNum1 {
    public static void main(String[] args) {
//теперь ты спроси три раза ввести число, сохрани каждое из них, и выведи максимальное
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое  число");
        int inputNum1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int inputNum2 = scanner.nextInt();

        System.out.println("Введите третье число");
        int inputNum3 = scanner.nextInt();

        if (inputNum1 >= inputNum2 && inputNum1 >= inputNum3) {
            System.out.printf("Максимальное число:  %d", inputNum1);

        } else if (inputNum2 >= inputNum1 && inputNum2 >= inputNum3) {
            System.out.printf("Максимальное число:  %d", inputNum2);

        } else
            System.out.printf("Максимальное число:  %d", inputNum3);
    }
}





