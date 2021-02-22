package Fedor.les02_04Tasks;

public class ReverseArray03 { //Ошибка, дописать метод

    /* Task Feb 05
    Надо написать метод, который принимает на вход int[],
    и возвращает новый int[], в котором все те же элементы,
    что и во входящем, только в обратном порядке*/
    public static int[] reverseArray1(int[] array) {
        final int lastIndex = array.length - 1;
        final int[] reverseArray1 = new int[array.length];

        for (int i = 0; i < array.length; i = i + 1) {

            reverseArray1[i] = array[lastIndex - i];
        }
        return reverseArray1;
    }


    public static int[] reverseArray(int[] array) {
        final int lastIndex = array.length - 1;
        final int[] reverseArray = new int[array.length];

        for (int i = 0, j = lastIndex; i < array.length; i = i + 1, j = j - 1) {
            reverseArray[i] = array[j];

        }
        return reverseArray;
    }

}


