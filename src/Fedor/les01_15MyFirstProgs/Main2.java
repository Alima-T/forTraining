package Fedor.les01_15MyFirstProgs;

import Fedor.les01_15MyFirstProgs.Fedor;

import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Здрасьте, как Вас зовут?");
        String inputName = scanner1.next();

        if (Objects.equals("Алина", inputName)) {
            System.out.printf("Очень приятно, %s \n", inputName + ", меня придумал Федор, а создала ты :)");
        }
        else if (Objects.equals("Федор", inputName)) {
            System.out.printf("Очень приятно, %s \n", inputName + ", меня придумал ты, а создала Алина :)");
        } else System.out.printf("Очень приятно, %s \n", inputName + ", меня придумал Федор, а создала Алина:)");
    }
}

