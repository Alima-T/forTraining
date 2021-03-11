package lessons.lesson16_Polymorphism;

public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Player player = new Player();
        Player player2 = new Player();

        BlackJackGame_Polymorphism game = new BlackJackGame_Polymorphism();
        game.addPlayer(player);
        game.addPlayer(player2);
        game.addPlayer(dealer);

        game.doFirstRound();
        game.doSecondRound();

        System.out.println();


    }
}
