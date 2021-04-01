package lessons.lesson17;

import lessons.lesson14CollectionNew.Coin;

import java.util.TreeSet;

public class CoinTreeSet {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2000, 2.5, 5, "Gold");
        Coin coin2 = new Coin(2000, 2.5, 5, "Gold");
        Coin coin3 = new Coin(1950, 4, 10, "Gold");
        Coin coin4 = new Coin(1908, 3.5, 500, "Gold");
        Coin coin5 = new Coin(1900, 5, 15, "Silver");
        Coin coin6 = new Coin(2001, 3, 5, "Gold");
        Coin coin7 = new Coin(2001, 2.5, 5, "Gold");
        Coin coin8 = new Coin(1950, 4, 10, "Silver");
        Coin coin9 = new Coin(1901, 3.5, 500, "Gold");
        Coin coin10 = new Coin(1900, 4, 15, "Silver");
        Coin coin11 = new Coin(2000, 2.5, 5, "Silver");
        Coin coin12 = new Coin(2000, 2.5, 5, "Bronze");
        Coin coin13 = new Coin(2000, 2.5, 5, "Bronze");

        TreeSet<Coin> coins = new TreeSet<>(); // Exception: Coin cannot be cast to class java.lang.Comparable
        // заходим в класс Coin из lesson14 и имплементируем интерфейс Comparable в <Coin>, что значит сравнивать себя c ... и переопределяем метод compareTo

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        coins.add(coin7);
        coins.add(coin8);
        coins.add(coin9);
        coins.add(coin10);
        coins.add(coin11);
        coins.add(coin12);
        coins.add(coin13);
        for (Coin coin : coins) {
            System.out.println(coin);

        }
    }
}
