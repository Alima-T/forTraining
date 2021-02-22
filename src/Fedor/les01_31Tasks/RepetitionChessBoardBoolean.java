package Fedor.les01_31Tasks;

public class RepetitionChessBoardBoolean {
    public static void main(String[] args) {

        boolean[][] chessBoard = createChessBoard();
        printChessBoardArray2(chessBoard);
    }


    public static boolean[][] createChessBoard() {
        final boolean chessBoard[][] = new boolean[8][8]; //создали переменную с именем chessBoard (эта переменная будет указана далее везде) типа boolean и присвоили ей значение new boolean[8][8]
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 != 0) {  // почему если оставить =0 показывает ошибку?
                    chessBoard[i][j] = true;
                } else chessBoard[i][j] = false;
            }
        }
        return chessBoard; //возвращает нашу пременную типа chessBoard типа boolean
    }

    private static void printChessBoardArray2(boolean[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] ? "* " : "0 "); // ? (if = true) "* " : (else= false) "0 "Тернарный(тройной) оператор Java является единственным условным оператором,
                                                                  // который принимает три операнда. Используется как замена оператора if-then-else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

