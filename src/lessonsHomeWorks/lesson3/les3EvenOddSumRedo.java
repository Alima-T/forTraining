package lessonsHomeWorks.lesson3;

import java.util.Scanner;

public class les3EvenOddSumRedo {

    public static void main(String[] args) {
        System.out.println("Нечетные числа от 20 до 40 в обратном порядке:");
        for (int i = 40; i >= 20; i--) {
            //if (i % 2 == 0) {
                System.out.println(i);
            //}
        }
        System.out.println("Четные числа от 20 до 40 по порядку:");
        for (int i = 20; i <= 40; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("Cумма четных чисел от 0 до 10 = %s \n", sum);

        int sum1 = 0;
        for (int i = 20; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                sum1 += i;
            }
        }
        System.out.printf("Cумма чисел от 20 до 100, кратных 4 и 5 = %s \n", sum1);



        int[] array1 = new int[]{10,20,30,40};
        int element1 = 0;
        for (int index = 0 ; index >=array1.length; index ++) {

            System.out.println(index);
        }

        int[] array = new int[]{10,20,30,40};
        array = new int[array.length];

        int element = 0;
        for (int index = array.length; index >=0 ; index --) {

          System.out.println(index);
        }
    }
}

