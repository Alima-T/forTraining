package daytelsJava.arrays7;

import java.util.Random;

public class DieRolling7_7 {   //die - кубик, кость игральная с 6 сторонами, roll 6000 times
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] dieSides = new int[7]; // у кубика 6 сторон со значениями от 1 до 6 (без 0)
        System.out.printf("%5s%10s\n", "Face", "dieSides");

        for (int roll = 1; roll < 6000; roll++) {
            int randomNumbersWithoutZero = randomNumbers.nextInt(6);

            ++dieSides[1 + randomNumbers.nextInt(6)]; // как это работает, как иначе написать?
        }

        for (int face = 1; face < dieSides.length; face++) {
            System.out.printf("%5d%10d\n", face, dieSides[face]);

        }
    }
}


