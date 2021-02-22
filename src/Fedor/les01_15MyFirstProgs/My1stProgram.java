package Fedor.les01_15MyFirstProgs;

import Fedor.les01_15MyFirstProgs.Fedor;

import java.util.Objects;
import java.util.Scanner;

public class My1stProgram {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Здрасьте, как Вас зовут?");
        String inputName = scanner1.next();

        if (Objects.equals("Алина", inputName)) {
            System.out.printf("Очень приятно, %s! Меня придумал Фёдор, а создала ты :) \n" , inputName);
        }
        else if (Objects.equals("Фёдор", inputName)) {
            System.out.printf("Очень приятно, %s! Меня придумал ты, а создала Алина :) \n", inputName);
        } else System.out.printf("Очень приятно, %s! Меня придумал Фёдор, а создала Алина :) \n" , inputName);
    }
}


