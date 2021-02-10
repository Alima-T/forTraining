package javaFedor.tests;

public class VarsCastingTest {

    final static String MESSAGE = "dfhsdkfjhsdjfh";

    public static void main(String[] args) {
        System.out.println(10d / 3);
        double a = 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001.1;
        double b = 3;
        float a1 = 10000000000000000000000000000000000000.1f;
        float b1 = 3f;
        System.out.println(a / b);
        System.out.println(a1 / b1);
        int value = 2147483647 + 1;// нет ошибки компиляции, но предупреждение что будет overflow
        // int value1 = 21474836478;
        value++;
        value++;
        byte value2 = 127;
        value2++;
        int val1 = value2;
        byte val3 = (byte) val1;
        // byte value3 = 127+1;// анологичное действие, но показывает ошибку и просит перевести в int
        long val = 9223372036854775807L + 1;
        char ch0 = 'a'; // single character literal
        char ch = '\u0061'; // a
        char ch1 = 062; // 2
        char ch2 = '\n'; // new line - перевод строки
        char ch3 = (char) value2;
        int h = 64;
        char ch4 = (char) h;//char ch4= h; - error
        System.out.println(value);
        System.out.println(val);
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(val3);
    }

    public void vars() {
        final int x = 8;
        final int y;
        y = 9;
        final int a;
        a = x + y;
    }
}
