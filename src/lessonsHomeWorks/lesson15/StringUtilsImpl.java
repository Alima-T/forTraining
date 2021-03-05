package lessonsHomeWorks.lesson15;

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
        }
        //throw new NumberFormatException // генерируется в любом случае  он runtime

        catch (NumberFormatException e) {
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
        public int[] findWord (String text, String word) throws NullPointerException {
            return new int[0];
        }

        @Override
        public double[] findNumbers (String text) throws CustomException {
            return new double[0];
        }
    }

