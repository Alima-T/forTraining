package lessons.lesson3;

public class HighestNumber {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 17;
        int num3 = 45;
        int num4 = 123;

        if (num4 > num3 && num4 > num2 && num4 > num1) {
            System.out.println(num4 + " - is the highest number.");
        } else if (num3 > num2 && num3 > num1 && num3 > num4) {
            System.out.println(num3 + " - is the highest number.");
        } else if (num2 > num3 && num2 > num4 && num2 > num1) {
            System.out.println(num2 + " - is the highest number.");
        }
        else {
            System.out.println(num1 + " - is the highest number.");
        }
    }
}

