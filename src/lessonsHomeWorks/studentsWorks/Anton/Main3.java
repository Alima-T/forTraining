package lessonsHomeWorks.studentsWorks.Anton;

import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {


        Metall gold = new Metall("Gold", 10);
        Metall silver = new Metall("Silver", 8);
        Metall copper = new Metall("Copper", 6);


        Coin2 coin = new Coin2(25, 1945, gold);
        Coin2 coin1 = new Coin2(25, 1945, silver);
        Coin2 coin2 = new Coin2(25, 1945, copper);
        Coin2 coin3 = new Coin2(25, 1945, silver);
        Coin2 coin4 = new Coin2(25, 1945, gold);

        TreeSet<Coin2> coins = new TreeSet<>();
        coins.add(coin);
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);


        for(Coin2 c:coins){
            System.out.println(c);
        }
    }
}
