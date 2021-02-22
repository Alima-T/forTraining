package homeWorks.lesson2;

public class Lesson2Task2Alina {
    public static void main(String[] args) {
        int side1 = 8;
        int side2 = 3;
        int side3 = 4;
        int side4 = 8;

        if (side1 == side3 && side2 == side4 && side2 != side3) {
            System.out.println("This is a Rectangle or a Parallelogram");
        }
        else if (side1 == side2 && side2 == side3 && side3 == side4 && side4 == side1) {
            System.out.println("This is a Square (has equal sides and angles) or a Rhombus (has equal sides)");
        }
        else if (side1 == side2 && side3 == side4 && side1 != side3) {
            System.out.println("This is a Kite - has two pairs of equal-length sides");
        }
        else if (side2 == side3 && side1 == side4 && side1 != side2) {
            System.out.println("This is a Kite - has two pairs of equal-length sides");
        }
        else if (side1 != side3 && side2 == side4) {
            System.out.println("This is an isosceles trapezium (has 1 pair of parallel sides and 1 pair of equal sides with equel angles)");
        }
        else if (side1 == side3 && side2 != side4) {
            System.out.println("This is an isosceles trapezium (has 1 pair of parallel sides and 1 pair of equal sides with equel angles)");
        }
        else if (side1 != side2 && side2 != side3 && side3 != side4 && side1 != side4 && side1 != side3 && side2 != side4) {
            System.out.println("This is an irregular quadrangle");
        }
        else System.out.println("This is an irregular quadrangle");
    }
}


