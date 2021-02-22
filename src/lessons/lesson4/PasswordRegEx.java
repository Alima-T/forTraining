package lessons.lesson4;

import java.util.Scanner;

public class PasswordRegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Придумайте и введите пароль.");

        String password = scanner.next();
        boolean hasSpecial = password.matches("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$");// В java добавляем еще один слеш к уже имеющемуся в regex, кроме указанных ниже значений, которые есть в java
    }
}
//    В Java существует достаточно много управляющих последовательностей. Вот их полный перечень:
//        \t cимвол табуляции.
//        \b cимвол возврата в тексте на один шаг назад или удаление одного символа в строке (backspace).
//        \n cимвол перехода на новую строку.
//        \r cимвол возврата каретки. ()
//        \f прогон страницы.
//        \' cимвол одинарной кавычки.
//        \" cимвол двойной кавычки.
//        \\ cимвол обратной косой черты (\).