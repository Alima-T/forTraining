package lessons.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RedoInitMethodsMineSweeper {
    public static int[][] gameField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Type the number of columns");
        int columns = scanner.nextInt();
        int[][] field = new int[rows][columns];
        return field;
    }

    public static String getLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the difficulty of the game.");
        System.out.println("Type: \"Easy\" \"Medium\" \"Difficult\"");
        String level = scanner.next();
        return level;
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] fillMines(int[][] field, String level) {
        int mines = 0;
        if (level.equalsIgnoreCase("Easy")) {
            mines = (field.length * field[0].length / 10) - 1;
        } else if (level.equalsIgnoreCase("Medium")) {
            mines = (field.length * field[0].length / 5) - 1;
        } else if (level.equalsIgnoreCase("Difficult")) {
            mines = ((field.length * field[0].length) / 100 * 30) - 1;
        }
        for (int i = 0; i < mines; i++) {
            addMine(field);
        }
        return field;
    }

    public static void addMine(int[][] field) {
        int randomRows = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomColumns = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if (field[randomRows][randomColumns] != 1) {
            field[randomRows][randomColumns] = 1;
        } else {
            addMine(field);
        }
    }
}
