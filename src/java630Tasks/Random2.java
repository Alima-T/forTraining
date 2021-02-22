package java630Tasks;

import java.util.Random;

public class Random2 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int max = 20;
            int min = 10;
            int range = max - min;
            int generatedNumberFromRange = rand.nextInt(range); // диапазон от 0 до 10
            int requiredNumber = generatedNumberFromRange + min; //смещение всего диапазона на заданную величину (min)
            System.out.println(requiredNumber);
        }
    }
}
