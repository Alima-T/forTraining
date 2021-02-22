package Fedor.les01_31Tasks;

public class SearchMethod {
    /*Напиши метод, который принимает на вход int[] и int. Метод должен найти и вернуть позицию указанного элемента в массиве.
    Соответственно, первый параметр - это массив; второй параметр - это то, что ищем в массиве.*/

    public static int indexSearchMethod(int[] array, int elementOfArray) {
        int index = -1;
        for (int i =0; i < array.length; i++) {
            if (array[i] == elementOfArray) {
                index = i;
                    break;
            }else if (i> array.length){
                index = -1;
            }
            else index = -1;

        }return index;
    }
    public static int indexSearchMethod1 (int[] array, int elementOfArray) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementOfArray) {
                return i;
            }
        }
        return -1;
    }
}

//  без break
//        Fedor
//        там сразу return
//        он круче, чем break)
//        он прерывает не только цикл, но вообще всю функцию








