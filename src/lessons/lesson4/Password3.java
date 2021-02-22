package lessons.lesson4;

import java.util.Scanner;

public class Password3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Придумайте и введите пароль.");

        String password = scanner.next();

        boolean hasAtLeast8 = password.length() > 8;
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasSpecial = password.matches("(^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$)");
        boolean noConditions = (password.contains("AND") || password.contains("NOT"));


        if (!hasAtLeast8) System.out.println("Must have 8 Character");
        if (!hasUppercase) System.out.println(("Must have an Uppercase character"));
        if (!hasLowercase) System.out.println("Must have a lowercase character");
        if (!hasSpecial) System.out.println("Must have characters and numbers");
        if (noConditions) System.out.println("Пороль не подходит, использованы неприменимые слова");

//        ТО есть regex потом надо еще дорабатывать под каждый язык?
//        да
//        вот из интернета справка
//        В Java существует достаточно много управляющих последовательностей. Вот их полный перечень:
//\t cимвол табуляции.
//\b cимвол возврата в тексте на один шаг назад или удаление одного символа в строке (backspace).
//\n cимвол перехода на новую строку.
//\r cимвол возврата каретки. ()
//\f прогон страницы.
//\' cимвол одинарной кавычки.
//\" cимвол двойной кавычки.
//\\ cимвол обратной косой черты (\).

    }
}
