package lessons.lesson15Exceptions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 or number2 is empty");
        }
        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {                               //throw new NumberFormatException // генерируется в любом случае - RuntimeException
            throw new NumberFormatException("number1 is not a number");
        }
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 is not a number");
        }
        if (num2 == 0) {
            throw new ArithmeticException("number2 is 0");
        }
        return num1 / num2;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        String regex = "[a-z][A-Z][а-я][А-Я]"; // (^.*[^A-zА-яЁё].*$") из гугла
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        String[] parts = text.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals(word)) {
                System.out.println(i);
            }

        }
        if (!m.find()) {
            throw new NullPointerException("There are no words"); // не знаю куда поставить, отрабатывает в любом случае
        }
        return new int[0];
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {
        String regex = "\\d+\\.\\d+"; // ("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?") из гугла
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
        if (!m.find()) {
            throw new CustomException("Not found"); // не знаю куда поставить, отрабатывает в любом случае
        }
        return new double[0];
    }

    // TESTING

    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        System.out.println();

        try {
            double result = utils.div("2", null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        try {
            int[] result2 = utils.findWord("I am a programmer, or I am not?", "am");
            System.out.println(Arrays.toString(result2));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


        try {
            double[] result3 = utils.findNumbers("aa87.89bb78.2234cc");
            System.out.print(Arrays.toString(result3));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}