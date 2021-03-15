package lessons.lesson16_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    protected ArrayList<Card> hand = new ArrayList<>(); //модификатор доступа protected, чтобы был доступ для наследников, а именно Dealer
    private boolean isWinner = true;




    public void addCardToHand(Card card) {
        hand.add(card);

    }

    public void printHand() {
        System.out.println("...Your hand...");
        for (Card c : hand) {
            System.out.println(c);
        }
        System.out.println("................");
    }

    public String needsCard() {
        this.printHand();
        System.out.println("Do you need another card? Yes/No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

//    private int face;
//
//    public int getFace() {
//        this.face = face;
//        return face;
//    }


    public int totalHandValue() {
        int total = 0; //сумма очков в картах
        for (Card card : hand) { //все переменные из Player доступны в дочернем классе
            total = total + card.getValue(); // card.getValue() - значение вновь полученной карты
        }
        return total;
    }
//
////        if (sum == 21) {
////            return "Winner";
////        } else if (sum > 21) {
////            return "Loser";
////        } else return sum;


    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}


