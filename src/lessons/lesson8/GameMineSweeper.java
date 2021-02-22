package lessons.lesson8;

public class GameMineSweeper {
    public static void main(String[] args) {
        char[][] field = InitMineSweeper.createField();
        String level = InitMineSweeper.getLevel();
        InitMineSweeper.fillMines(field, level);
        InitMineSweeper.printGameField(field);
    }
}
