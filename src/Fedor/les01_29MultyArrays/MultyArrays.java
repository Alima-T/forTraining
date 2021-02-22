package Fedor.les01_29MultyArrays;

public class MultyArrays {
    public static void main(String[] args) {
        int numbers[][] = {{49, 50, 51}, {52, 53, 54}, {55, 56, 57}};
        for (int x[] : numbers) {
            for (int y : x) {
                char c = (char) y;
                System.out.println(c);


            }
        }
    }
}

