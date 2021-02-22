package lessons.lesson4;

import java.util.Scanner;

public class EmailAddressRegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email: ");
        String email = scanner.next();
        boolean inputEmail = email.matches("(^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$)");

        if (!inputEmail) System.out.println("Адрес не соответствует правилам.");
        else System.out.println("Адрес создан успешно.");


    }
}
