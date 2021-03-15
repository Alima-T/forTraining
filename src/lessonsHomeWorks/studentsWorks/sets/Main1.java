package lessonsHomeWorks.studentsWorks.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1999, 11, 10, "Золото");
        Coin coin2 = new Coin(1995, 13, 100, "Бронза");
        Coin coin3 = new Coin(1995, 13, 100, "Медь");
        Coin coin4 = new Coin(1991, 13, 1000, "Серебро");
        Coin coin5 = new Coin(1991, 13, 100, "Платина");
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        Coin coin6 = new Coin(1995, 13, 100, "Золото");
        Coin coin7 = new Coin(1995, 13, 100, "Бронза");
        Coin coin8 = new Coin(1995, 13, 100, "Медь");
        Coin coin9 = new Coin(1995, 13, 100, "Серебро");
        Coin coin10 = new Coin(1995, 13, 100, "Платина");
        ArrayList<Coin> arrayCoins = new ArrayList<>();
        arrayCoins.add(coin6);
        arrayCoins.add(coin7);
        arrayCoins.add(coin8);
        arrayCoins.add(coin9);
        arrayCoins.add(coin10);
        Collections.sort(arrayCoins);
        for (Coin c : arrayCoins){
            System.out.println(c);
        }
        System.out.println("_______________________");

        for (Coin coin: coins){
            System.out.println(coin);
        }

    }
}
