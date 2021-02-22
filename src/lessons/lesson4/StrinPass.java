package lessons.lesson4;

import java.util.Scanner;

public class StrinPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Придумайте и введите пароль.");
        String password = scanner.next();
        if (password.length() < 8) {
            System.out.println("Пароль не подходит, в нем меньше 8 символов.");
            return;
        }

        if (!password.contains("(") && !password.contains(")")                 // ! - doesn't contain
                && !password.contains("*") && !password.contains("!")           // &&  одновременно; || - или
                && !password.contains("#")) {
            System.out.println("Пароль не подходит, в нем !НЕТ спецсимволов.");
            return;
        }
        if (password.contains("(") || password.contains(")")                // ! - doesn't contain
                || password.contains("*") || !password.contains("!")           // &&  одновременно; || - или
                || password.contains("#")) {
            System.out.println("Пароль средней сложности.");
            return;
        }

        int summNums = 0;
        char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < nums.length; i++) {
            if (password.contains(nums[i] + "")) {
                summNums++;
            }
        }
        if (summNums == 0) {
            System.out.println("Пароль не подходит. В пароле нет чисел.");

        } else {
            System.out.println("Ура, пароль подходит!");
        }


    }
}
