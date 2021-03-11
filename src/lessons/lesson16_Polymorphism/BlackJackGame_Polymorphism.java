package lessons.lesson16_Polymorphism;

import java.util.ArrayList;

public class BlackJackGame_Polymorphism {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();

    public void addPlayer(Player player) {
        players.add(player);

    }


    public void doFirstRound() {
        for (int i = 0; i < 2; i++)
            for (Player p : players) // p - текущий игрок
                p.addCardToHand(deck.getRandomCard());
    }

    public void doSecondRound() {
        for (Player p : players) {
//            p.printHand();
            this.addCardsIfNeed(p);
        }
    }

    public void addCardsIfNeed(Player player) { // ярчайший пример полиморфизма - player/Dealer(extends Player)
        String answer = player.needsCard();     // player.needsCard - если вызовит крупье вызовится метод (измененный), который в классе Dealer (наследован от Player), если же игрок, то метод (обычный), который в классе Player и у каждого он свой (отличаются)
        if (answer.equals("Yes")) {
            player.addCardToHand(deck.getRandomCard());
            this.addCardsIfNeed(player);
        }
    }

    //   public int getPlayersStatus(int sum){
//        players[i].get
//    }
//    public String GameOver () {
//        players.g
//        int sum = 0;
//        for (Card card : ) {
//            sum = sum + card.getValue(); // card.getValue() - значение вновь полученной карты
//        }
//        if (sum == 21) {
//            return "Winner";
//        } else {
//            return "Loser";
//       }

}


