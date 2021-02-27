package daytelsJava.methods6;

import java.util.Random;

public class RollDieSwitch {
    public static void main(String[] args) {

        Random random = new Random();
        int frequency1 = 0; //частота для числа 1
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int roll = 1; roll < 6000; roll++) {

            int randomNumber = random.nextInt(6);
            int randomNumberExceptZero = randomNumber + 1;

            switch (randomNumberExceptZero) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                case 6:
                    ++frequency6;
                    break;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%10d\n2\t%10d\n3\t%10d\n4\t%10d\n5\t%10d\n6\t%10d", frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);

    }


}


