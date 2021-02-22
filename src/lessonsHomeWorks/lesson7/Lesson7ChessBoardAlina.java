package lessonsHomeWorks.lesson7;

public class Lesson7ChessBoardAlina {
    public static void main(String[] args) {
        printChessBoard();
        System.out.print("\n\n\n");
        final boolean[][] chessBoard = createChessBoard();
        Lesson7PrinterAlina.printBooleanArray(chessBoard);
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
    private static boolean[][] createChessBoard() {
        boolean chessBoard[][] = new boolean[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 != 0) {
                    chessBoard[i][j] = true;
                } else {
                    chessBoard[i][j] = false;
                }
            }
        }
        return chessBoard;
    }
}
