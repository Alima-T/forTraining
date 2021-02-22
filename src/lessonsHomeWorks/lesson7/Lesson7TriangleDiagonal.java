package homeWorks.lesson7;

public class Lesson7TriangleDiagonal {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i <= j) {
                    System.out.print(nums[i][j] + "  ");
                } else
                    System.out.print(" " + "  ");
            }
            System.out.println();

        }
        System.out.print("\n\n");

        int[][] numbs = new int[5][5];
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs[i].length; j++){
                if (i >= j) {
                    System.out.print(numbs[i][j] + "  ");
                } else
                    System.out.print(" " + "  ");
            }
            System.out.println();

        }
        System.out.print("\n\n");
        int[][] numbers = new int[5][5];
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    System.out.print(numbers[i][j] + "  ");
                } else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }
}


