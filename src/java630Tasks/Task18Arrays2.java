package java630Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task18Arrays2 {
    /*//Task 18.12 Написать класс, который заполняет случайными 3-х значными числами массив, при инициализации которого размер вводится с консоли.
    //После заполнения класс должен выводить значения массива одной строкой.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int arrayLength = scanner.nextInt(); // or int []array = new int[scanner.nextInt()];
        int[] array = new int[arrayLength];
        Random random = new Random();
        int min = 100;
        int max = 1000;
        int range = max - min;

        for (int i = 0; i < array.length; i = i + 1) {
            int generatedNumberFromRange = random.nextInt(range);
            int requiredNumber= generatedNumberFromRange+min;
            array[i] = requiredNumber;
        }
        System.out.println(Arrays.toString(array));

    }
}



