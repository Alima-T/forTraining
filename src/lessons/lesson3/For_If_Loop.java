package lessons.lesson3;

public class For_If_Loop {
    public static void main(String[] args) {
        for (int i = 100; i <= 150; i++) {
            if (i % 5 == 0 && i % 7 == 0) {     //find a number between 100 and 150 that is a multiple (кратно) of 5 and 7 at the same time
                System.out.println(i);
            }
        }
    }
}
