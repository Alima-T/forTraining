package lessonsHomeWorks.lesson4;

import java.util.Scanner;

public class PasswordRedo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; ; i++) {

            System.out.println("Type you password");
            String inputPassword = input.next();

            if (!inputPassword.contains("!") && !inputPassword.contains("?") && !inputPassword.contains("@")
                    && !inputPassword.contains("#") && !inputPassword.contains("$") && !inputPassword.contains("%")
                    && !inputPassword.contains("&") && !inputPassword.contains("*") && !inputPassword.contains("{")
                    && !inputPassword.contains("}") && !inputPassword.contains("|") && !inputPassword.contains("_")
                    && !inputPassword.contains("+") && !inputPassword.contains("-") && !inputPassword.contains("=")
                    && !inputPassword.contains("^") && !inputPassword.contains("~") && !inputPassword.contains("'")) {
                System.out.println("Your password must contain at least one special character");

            } else if (!inputPassword.contains("0") && !inputPassword.contains("1") && !inputPassword.contains("2")
                    && !inputPassword.contains("3") && !inputPassword.contains("4") && !inputPassword.contains("5")
                    && !inputPassword.contains("6") && !inputPassword.contains("7") && !inputPassword.contains("8")
                    && !inputPassword.contains("9")) {
                System.out.println("Your password must contain at least one number digit");

            } else if (!inputPassword.equals(inputPassword.toUpperCase())) {
                System.out.println("Your password must contain at least one Uppercase letter");

            } else if (!inputPassword.equals(inputPassword.toLowerCase())) {
                System.out.println("Your password must contain at least one lowercase letter");

            } else if (!(inputPassword.length() > 8) && !(inputPassword.length() < 30)) {
                System.out.println("Your password must be between 8 and 30 characters");

            } else {
                System.out.println("Your password accepted");
                break;
            }
        }
    }
}


