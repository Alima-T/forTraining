package lessonsHomeWorks.lesson7;

public class Lesson7PrinterAlina {

    public static void printBooleanArray(boolean[][] chessBoard) {
        for(int i = 0; i< chessBoard.length; i++){
            for(int j = 0; j< chessBoard.length; j++){
                System.out.print(chessBoard[i][j] ? "* " : "0 ");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(boolean[] row : chessBoard){
            for(boolean cell : row){
                System.out.print(cell ? "* " : "0 ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
