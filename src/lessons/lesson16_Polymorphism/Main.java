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

        game.printWinner();

        // для внешнего интерфейса javaFX/ java swing - устаревшая уже библиотека, открывается через комп. а не через android или ios

    }
}
