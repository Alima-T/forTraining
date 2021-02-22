package lessons.lesson7;

public class Arrays {
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

            int[][] numbs = new int[5][5];
            for (int i = 0; i < numbs.length; i++) {
                for (int j = 0; j < numbs[i].length; j++) {
                    if (i >= j) {
                        System.out.print(numbs[i][j] + "  "); //ln removed - чтобы вывод значений i  шел в одну строку, а не на каждой
                    } else
                        System.out.print(" " + "  "); //ln removed - чтобы вывод значений i шел в одну строку, а не на каждой
                }
                System.out.println();
            }

        }
    }


