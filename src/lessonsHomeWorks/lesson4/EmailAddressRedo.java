package lessonsHomeWorks.lesson4;

import java.util.Scanner;

public class EmailAddressRedo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your email address:");
        String inputEmail = scanner.next();
        if (!inputEmail.contains("!") && !inputEmail.contains("?") && !inputEmail.contains("@")
                && !inputEmail.contains("#") && !inputEmail.contains("$") && !inputEmail.contains("%")
                && !inputEmail.contains("&") && !inputEmail.contains("*") && !inputEmail.contains("{")
                && !inputEmail.contains("}") && !inputEmail.contains("|") && !inputEmail.contains("_")
                && !inputEmail.contains("+") && !inputEmail.contains("-") && !inputEmail.contains("=")
                && !inputEmail.contains("^") && !inputEmail.contains("~") && !inputEmail.contains("'")) {
            System.out.println("Your password must contain at least one special character");

        } else if (!inputEmail.contains("0") && !inputEmail.contains("1") && !inputEmail.contains("2")
                && !inputEmail.contains("3") && !inputEmail.contains("4") && !inputEmail.contains("5")
                && !inputEmail.contains("6") && !inputEmail.contains("7") && !inputEmail.contains("8")
                && !inputEmail.contains("9")) {
            System.out.println("Your password must contain at least one number digit");


        } else if (!inputEmail.equals(inputEmail.toLowerCase())) {
            System.out.println("Your password must contain at least one lowercase letter");

        } else if (!(inputEmail.length()>8 && !(inputEmail.length()<30))) {
            System.out.println("Your password must be between 8 and 30 characters");
        }
    }
}

