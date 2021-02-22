package lessons.lesson8;

public class GameMineSweeperRedo {
    public static void main(String[] args) {
        int [][] field = InitMineSweeperRedo.createField();
        String level = InitMineSweeperRedo.getLevel();
        InitMineSweeperRedo.fillMines(field, level);
        InitMineSweeperRedo.printGameField(field);
    }
}
