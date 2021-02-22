package lessons.lesson4;

import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Придумайте и введите пароль.");
        String password = scanner.next();

        boolean hasAtLeast8 = password.length() > 8;
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLettersAndNums = password.matches("^[а-яА-ЯёЁa-zA-Z0-9]*");
        boolean hasSpecial = password.matches("(^(?=.*\\d)(?=.*)(?=.*(?!.*\\s).*$))");
        boolean noConditions = (password.contains("AND") || password.contains("NOT"));


        if (!hasAtLeast8) System.out.println("Must have 8 Character");
        if (!hasUppercase) System.out.println(("Must have an Uppercase character"));
        if (!hasLowercase) System.out.println("Must have a lowercase character");
        if (!hasLettersAndNums) System.out.println("Must have letters and numbers");
        if (!hasSpecial) System.out.println("Must have characters");
        if (noConditions) System.out.println("Пороль не подходит, использованы неприменимые слова");

    }
}
