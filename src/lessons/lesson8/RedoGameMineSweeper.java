package lessons.lesson8;

public class RedoGameMineSweeper {
    public static void main(String[] args) {
        int [][]field = RedoInitMethodsMineSweeper.gameField();
        String level = RedoInitMethodsMineSweeper.getLevel();
        RedoInitMethodsMineSweeper.fillMines(field,level);
        RedoInitMethodsMineSweeper.addMine(field);
        RedoInitMethodsMineSweeper.printField(field);


    }
}
