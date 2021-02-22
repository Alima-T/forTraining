package lessons.lesson6Methods;

import java.util.Scanner;

public class Main6_1 {
    public static void main(String[] args) {
        StringUtils.printRevers("fghutrh");
        StringUtils.printRevers("I am a programmer");

        double result = FigureUtils.squareTriangle(5,6,7);
        System.out.println(result);

        StringUtils.printTextByWord("I am a programmer");

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Hi! How old are you?");
        int  resultat = scanner1.nextInt();
        System.out.println(resultat);



    }
}
