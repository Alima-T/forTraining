package homeWorks.lesson7;

public class CreateDiamond {
  //ДОДЕЛАТЬ!!!
    private static boolean[][] createDiamond() {
        final boolean chessBoard[][] = new boolean[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if (false) {
                    chessBoard[i][j] = true;
                } else {
                    chessBoard[i][j] = false;
                }
            }
        }
        return chessBoard;
    }
}
