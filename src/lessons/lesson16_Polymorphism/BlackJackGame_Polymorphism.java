package lessons.lesson16_Polymorphism;

import java.util.ArrayList;

public class BlackJackGame_Polymorphism {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();

    protected String winText = "You win! :)";
    protected String loseText = "You lose... :(";

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

    public void printWinner(){
        for (Player p: players){
            if (p.totalHandValue()>21){
                p.setWinner(false);
            }
        }
        int winnerValue = this.maxHandsValue();
        for(Player p: players){
            if(p.totalHandValue() == winnerValue) {
                System.out.println((winText));
                p.printHand();
                System.out.println(".............");
            }else {
                System.out.println(loseText);
                p.printHand();
                System.out.println(".............");
            }
        }
    }

private int maxHandsValue(){
        //19
    //

    //25 false
        int maxHandsValue = 0;
        for(Player p: players){
            if (p.totalHandValue()>maxHandsValue&&p.isWinner()) { // p.isWinner() - он в игре?, если не false , то в игре
                maxHandsValue= p.totalHandValue();
            }
        }return maxHandsValue;
}
}


