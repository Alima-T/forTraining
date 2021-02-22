package homeWorks.lesson7;

public class Lesson7Task2Romb {
    public static void main(String[] args) {
        int numbs [][] = new int [8][8];
        for(int i=0; i< numbs.length; i++){
            int end = (i<numbs.length/2) ? i : numbs.length/2 - i;
            for (int j = 0; j < end; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}