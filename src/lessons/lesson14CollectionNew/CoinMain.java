package lessons.lesson14CollectionNew;

import java.util.LinkedHashSet;

public class CoinMain {
    public static void main(String[] args) {

        Coin coin1 = new Coin(2000, 2.5, 5, "Gold");
        Coin coin2 = new Coin(2000, 2.5, 5, "Gold");
        Coin coin3 = new Coin(1950, 4, 10, "Silver");
        Coin coin4 = new Coin(1908, 3.5, 500, "Gold");
        Coin coin5 = new Coin(1900, 5, 15, "Silver");

       // HashSet<Coin> coins = new HashSet<>(); //выводит эелементы вразброс,т.к. сохраняет по сложному алгориту
        LinkedHashSet<Coin> coins = new LinkedHashSet<>(); //выводит элементы по порядку вхождения
        coins.add(coin2);
        coins.add(coin1);
        coins.add(coin5);
        coins.add(coin3);
        coins.add(coin4);

//  coin1 и coin2 одинаковые монеты и должны иметь одинаковый hashCode, поэтому нужно обязательно переопределять equals b hashCode,
//  после чего они имеют одинаковые hashCode и хранятся в одной баночке.

        System.out.println(coin1.hashCode());
        System.out.println(coin2.hashCode());
        System.out.println(coin3.hashCode());
// coin1 и coin2 одинаковые монеты и метод equals должен возвращать true, но если не переопределить метод в классе Coin, то будет возвращать по умолчанию false. Переопределяем.
        System.out.println(coin1.equals(coin2));

        for (Coin coin : coins) {
            System.out.println(coin);
        }

    }
}
