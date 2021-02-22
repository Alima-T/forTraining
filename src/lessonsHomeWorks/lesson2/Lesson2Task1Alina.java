package homeWorks.lesson2;

public class Lesson2Task1Alina {
    public static void main(String[] args) {
        int a = 99;
        int b = 25;
        int c = 67;
        int d = 20;


        if (a > b && a > c && a > d) {
            System.out.println(a + " - is the highest number.");
        }
        else if (b > a && b > c && b > d) {
            System.out.println(b + " - is the highest number.");
        }
        else if (c > a && c > b && c > d) {
            System.out.println(c + " - is the highest number.");
        }
        else
            System.out.println(d + " - is the highest number.");
        }
    }


