package lessons.lesson7;

public class Main2 {
    public static void main(String[] args) {
        int[][] nums = {{2, 6, 4, 6},
                        {5, 3, 6, 8},
                        {3, 5, 7, 9}};
        for (int  i= 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }
}

// шахматы, сапер, крестики нолики

