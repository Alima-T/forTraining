package lessons.lesson4;

public class SplitText {
    public static void main(String[] args) {
        String text =   "I am a programmer";
        String[] parts = text.split(" ");

        for(int i=0; i<parts.length;i++){
            System.out.println(parts[i]);
        }

    }
}
