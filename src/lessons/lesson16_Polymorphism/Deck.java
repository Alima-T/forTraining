package lessons.lesson16_Polymorphism;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {
        cards.add(new Card("2 трефа", 2));
        cards.add(new Card("2 бубна", 2));
        cards.add(new Card("2 черви", 2));
        cards.add(new Card("2 пика", 2));

        cards.add(new Card("3 трефа", 3));
        cards.add(new Card("3 бубна", 3));
        cards.add(new Card("3 черви", 3));
        cards.add(new Card("3 пика", 3));

        cards.add(new Card("4 трефа", 4));
        cards.add(new Card("4 бубна", 4));
        cards.add(new Card("4 черви", 4));
        cards.add(new Card("4 пика", 4));

        cards.add(new Card("5 трефа", 5));
        cards.add(new Card("5 бубна", 5));
        cards.add(new Card("5 черви", 5));
        cards.add(new Card("5 пика", 5));

        cards.add(new Card("6 трефа", 6));
        cards.add(new Card("6 бубна", 6));
        cards.add(new Card("6 черви", 6));
        cards.add(new Card("6 пика", 6));

        cards.add(new Card("7 трефа", 7));
        cards.add(new Card("7 бубна", 7));
        cards.add(new Card("7 черви", 7));
        cards.add(new Card("7 пика", 7));

        cards.add(new Card("8 трефа", 8));
        cards.add(new Card("8 бубна", 8));
        cards.add(new Card("8 черви", 8));
        cards.add(new Card("8 пика", 8));

        cards.add(new Card("9 трефа", 9));
        cards.add(new Card("9 бубна", 9));
        cards.add(new Card("9 черви", 9));
        cards.add(new Card("9 пика", 9));

        cards.add(new Card("10 трефа", 10));
        cards.add(new Card("10 бубна", 10));
        cards.add(new Card("10 черви", 10));
        cards.add(new Card("10 пика", 10));

        cards.add(new Card("Валет трефа", 10));
        cards.add(new Card("Валет бубна", 10));
        cards.add(new Card("Валет черви", 10));
        cards.add(new Card("Валет пика", 10));

        cards.add(new Card("Дама трефа", 10));
        cards.add(new Card("Дама бубна", 10));
        cards.add(new Card("Дама черви", 10));
        cards.add(new Card("Дама пика", 10));

        cards.add(new Card("Король трефа", 10));
        cards.add(new Card("Король бубна", 10));
        cards.add(new Card("Король черви", 10));
        cards.add(new Card("Король пика", 10));

        cards.add(new Card("Туз трефа", 11));
        cards.add(new Card("Туз бубна", 11));
        cards.add(new Card("Туз черви", 11));
        cards.add(new Card("Туз пика", 11));
    }
    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0,52);
        return cards.get (randomNum);
    }
}
