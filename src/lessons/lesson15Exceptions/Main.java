package lessons.lesson15Exceptions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        //double result = utils.div("2",null); // double result = utils.div("2","0") все рантаймексепшн, никто не перехватил т.к. мы не поставили перехватчика
        //System.out.println(result);
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
//        try {
//            int[] result1 = utils.findWord("668798", "am");
//            System.out.println(Arrays.toString(result1));
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            int[] result2 = utils.findWord("I am a programmer, am I or not?", "am"); //"I am a programmer, am I or not?"
            System.out.println(Arrays.toString(result2));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            double[] result2 = utils.findNumbers("aa87.89bb78.2234cc"); //  dfgh87.89gft78.2234hg
            System.out.print(Arrays.toString(result2));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
// доделать StringUtils подсказка pattern