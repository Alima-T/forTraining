package lessons.lesson3;

public class For_If_LoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {

            if (i == 2) {
                continue;
            }

            System.out.println(i);
        }
    }
}
