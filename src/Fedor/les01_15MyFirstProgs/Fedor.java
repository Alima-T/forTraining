package Fedor.les01_15MyFirstProgs;

import java.util.Scanner;

public class Fedor {
    public static void main(String[] args) {
        System.out.println("Здрасьте, как Вас зовут?");

        final Scanner scanner1 = new Scanner(System.in);
        final String inputName = scanner1.next();

        String author = "Фёдор";
        String creator = "Алина";

        if (creator.equals(inputName)) {
            creator = "ты";
        } else if (author.equals(inputName)) {
            author = "ты";
        }

        System.out.printf ("Очень приятно, %s! Меня придумал %s, а создала %s :)\n", inputName, author, creator);
    }
}

