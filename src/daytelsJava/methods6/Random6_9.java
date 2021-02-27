package daytelsJava.methods6;

import java.util.Random;
// Shifted and scaled random integers- cдвинутые и масштабированные случайные целые числа.
public class Random6_9 {
    public static void main(String[] args) {
        Random random = new Random();
        int face; // stores each random integer generated
        // loop 20 times
        for (int counter = 1; counter <= 25; counter++) {
            //pick random interger from 1 to 6
            face = random.nextInt(6) + 1; //
            System.out.printf("%d  ", face); // display generated value
            //if counter (counter) is divisible by 5, start a new line
            if (counter % 5 == 0) {// остаток от деления на 5 ==0 без остатка, 5/5 =0, 10/5 = 2 и т.д.
                System.out.println();

            }
        }
    }
}
