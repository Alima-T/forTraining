package daytelsJava.arrays7;

public class Arrays7_6BarChart {
    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution:"); //распределение оценок

        //for each array element output the bar of the chart
        for (int i = 0; i < array.length; i++) {
            //output the bar label (00-09:, 10-19:,...90-99,100)
            if (i == 10)
                System.out.printf("%5d : ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);


            for (int stars = 0; stars < array[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        } // end outer for
    }// end main
}  // end class