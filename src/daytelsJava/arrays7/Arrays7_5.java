package daytelsJava.arrays7;

public class Arrays7_5 {
    public static void main(String[] args) {
        int array[];// declare array named array
        array = new int[10]; // create the space for array
        System.out.printf("%s%5s\n", "Index", "Value");// column headings
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d\n", counter, array[counter]); // shift to 5 and 8 signs
        }
        System.out.println();

        final int arrayLength = 10;
        array = new int[arrayLength];

        System.out.printf("%8s%10s\n", " Index", " Value");// 8 and 10 shift to 8 and 10 signs

        for (int i = 0; i < array.length; i++) {
            array[1] = 2 + 2 * i;

            System.out.printf("%8d%10d\n", i, array[i]);

        }
        System.out.println();

        array = new int[]{87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for (int i = 0; i < array.length; i++) { // если есть тело, то sout за пределами тела.
            total = total + array[i];
        }
        System.out.printf("Total of all elements is: %d", total);

        System.out.println();

        for (int i = 0; i < array.length; i++)  // если тела нет, то sout прописываем сразу
            total = total + array[i];
        System.out.printf("Total of all elements is: %d", total);

    }
}
