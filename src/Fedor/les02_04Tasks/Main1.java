package Fedor.les02_04Tasks;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] array1 = new int[]{10, 20, 30, 40, 55};
        int[] array2 = new int[5];
        array2[0] = array1[4];
        array2[1] = array1[3];
        array2[2] = array1[2];
        array2[3] = array1[1];
        array2[4] = array1[0];


        final int lastIndex = array1.length - 1;
        for (int i = 0; i < array1.length; i = i + 1) {
            array2[i] = array1[lastIndex - i];
        }
        System.out.println(Arrays.toString(array2));


        for (int i = 0, j = lastIndex; i < array1.length; i = i + 1, j = j - 1) {
            array2[i] = array1[j];
        }
        System.out.println(Arrays.toString(array2));

        System.out.println(Arrays.toString(ReverseArray03.reverseArray1(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(ReverseArray03.reverseArray(new int[]{1, 2, 3, 4, 5})));
//

    }
}
