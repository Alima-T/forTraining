package homeWorks.lesson4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника. Сторона A = ");
        int A = scanner.nextInt();

        System.out.println("Введите стороны треугольника. Сторона B = ");
        int B = scanner.nextInt();

        System.out.println("Введите стороны треугольника. Сторона C = ");
        int C = scanner.nextInt();

        int P = A + B + C;
        System.out.printf("Периметр треугольника = %d", P);
        System.out.println(" ");

        int P1 = P/2;

        int S = (int) sqrt(P1 * (P1 - A) * (P1 - B) * (P1 - C));    //casted double to int

        System.out.printf("Прощадь треугодьника = %d" , S);


    }
}


