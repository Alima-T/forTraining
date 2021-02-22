package lessons.lesson7;

public class RectangularArray {
    public static void main(String[] args) {
        int [][] nums = new int[5][5];
         for(int i= 0;i<nums.length; i++){
             for(int j=0; j< nums.length; j++){
                 System.out.print((nums[i][j] + "  ")); //ln - removed

             }
             System.out.println();
         }
    }
}
