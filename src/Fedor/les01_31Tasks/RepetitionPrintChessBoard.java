package Fedor.les01_31Tasks;

public class RepetitionPrintChessBoard {

    public static void main(String[] args) {

        printChessBoard();
    }

    public static void printChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
