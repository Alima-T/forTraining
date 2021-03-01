package lessons.lesson14;
// c переопределеним методов
import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        CoinHashSet coin1 = new CoinHashSet(1900, 2.5, 5, "Gold");
        CoinHashSet coin2 = new CoinHashSet(1900, 2.5, 5, "Gold");
        CoinHashSet coin3 = new CoinHashSet(1800, 4, 10, "Gold");
        CoinHashSet coin4 = new CoinHashSet(1500, 2, 5, "Silver");
        CoinHashSet coin5 = new CoinHashSet(1950, 2.5, 500, "Silver");

        HashSet<CoinHashSet> coins = new HashSet<>();
        coins.add(coin2);
        coins.add(coin1);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        System.out.println(coin2.hashCode());
        System.out.println(coin1.hashCode());
        System.out.println(coin3.hashCode());

        System.out.println(coin2.equals(coin1));


        for (CoinHashSet coin: coins) {
            System.out.println(coin);

        }
    }
}


