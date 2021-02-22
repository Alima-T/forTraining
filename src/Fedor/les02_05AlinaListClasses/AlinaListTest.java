package Fedor.les02_05AlinaListClasses;

import java.util.Arrays;

public class AlinaListTest {
    static int[] list = {9, 8, 7, 6, 5, 4, 5, 6, 5, 0, 5}; // наш массив чисел

    public static void main(String[] args) {
        System.out.println("Количество элементов массива " + getElementsCount(5));

                System.out.println(Arrays.toString(list));
    }

    static int getElementsCount(int value) {
        int count = 0;
        for (int i : list) {
            if (i == value) {
                count++;
            }
        }
        return count;
    }

//    public int[] clear() {
////        for (int [] array : list) {
////            array = 0;
////            return;
//
//
//        }
//    }

}




