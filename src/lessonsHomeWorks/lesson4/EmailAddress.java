package lessonsHomeWorks.lesson4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address");
        String mail = scanner.next();

        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(mail);

        if (mat.matches()) {
            System.out.println("This is an email address");
        } else {
            System.out.println("This is not an email address");
        }
    }
}

/* public static Pattern compile(String regex) - Whenever you need to match a text against a regular expression pattern more than one time, create a Pattern instance using the Pattern.compile() method.
This method accepts one single parameter regex which represents the given regular expression compiled into a pattern.

public static Pattern compile(String regex, int flags)
The compile(String, int) method of the Pattern class used to create a pattern from the regular expression with the help of flags where both expression and flags are passed as parameters to the method.
The Pattern class contains a list of flags (int constants) that can be helpful to make the Pattern matching behave in certain ways. For example,
The flag name CASE_INSENSITIVE is used to ignore the case of the text at the time of matching.public static Pattern compile(String regex, int flags)
Parameters: This method accepts two parameters:
regex: This parameter represents the given regular expression compiled into a pattern.
flag: This parameter is an integer (целое число) representing Match flags(флаги соответствия, a bit mask that may include CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and COMMENTSПараметры: Этот метод принимает два параметра:
regex: Этот параметр представляет данное регулярное выражение, скомпилированное в шаблон.
флаг: Этот параметр представляет собой целое число, представляющее флаги соответствия, битовую маску.
*/
