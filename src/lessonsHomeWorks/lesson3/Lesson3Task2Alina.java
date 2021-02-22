package lessonsHomeWorks.lesson3;

public class Lesson3Task2Alina {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 30; i ++) {    // i ++ or i+=1
            if (i % 2 > 0) {                // or if (i % 2 != 0)
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
//        if (i % 2 > 0 && i > 0) ;
//        sum = sum + i;
//        не очень
