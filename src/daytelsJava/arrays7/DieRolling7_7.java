package daytelsJava.arrays7;

import java.util.Random;

public class DieRolling7_7 {   //die - кубик, кость игральная с 6 сторонами, roll 6000 times
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] frequency = new int[7]; // у кубика 6 сторон со значениями от 1 до 6 (без 0)
        System.out.printf("%5s%10s\n", "Face", "Frequency");

        for (int roll = 1; roll <= 6000; roll++) {

            int randomNumber = randomNumbers.nextInt(6);//nextInt выдает числа от 0 до 5(всего 6).
            int randomNumberWithoutZero = randomNumber + 1;  //+1, чтобы сдвинуть от 1 до 6
            frequency[randomNumberWithoutZero]=frequency[randomNumberWithoutZero]+1;
            //++(frequency[randomNumberWithoutZero]); //увеличение значения элемента массива на 1 до новой итерации, как это работает, как иначе написать?
            //frequency[randomNumberWithoutZero]++;// увеличение после итерации

        }

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%5d%10d\n", face, frequency[face]);

        }
    }
}

/* Если у меня также есть метод add, то в чем разница между следующим:
   public void add(int value) {
       array[value]++; VS ++array[value];
    }
В этом коде нет никакой разницы. Но разница в целом есть:

        arr[0]=1;
        int var1=arr[0]++;
        System.out.println(var1);
        arr[0]=1;
        int var2=++arr[0];
        System.out.println(var2);

Выход

1
2
 */