package Fedor.les01_15MyFirstProgs;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("Привет, как тебя зовут?");

        Scanner scanner1 = new Scanner(System.in);
        String inputName = scanner1.next();

        String creator = "Alina";
        if (creator.equals(inputName)) {
            creator = "ты";
        }

        System.out.printf("Приятно познакомиться,%s! Меня создала %s :) \n", inputName, creator);
    }
//
//        System.out.println("Привет, как тебя зовут?");
//        System.out.printf("Приятно познакомиться,%s \n",inputName);
//
//        if(inputName =="Алина")
//
//    {
//        System.out.println("Меня создала ты.");
//    } else System.out.println("Меня создала Алина.");
}

