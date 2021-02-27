package Fedor.les02_05AlinaListClasses;

import java.util.Arrays;

public class AList1 {

    long[] list = new long[1];

    public void add(long value) { // + void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
//        for (long array : list) { // - foreach это разновидность цикла for, которая используется, когда нужно обработать все элементы массива (каждый) или коллекции.
        long[] newList = new long[list.length + 1]; //
        for (int i = 0; i < list.length; i = i + 1) {
            newList[i] = list[i];
            newList[list.length - 1] = value;
            list[i] = newList[i];


        }

//    public void add1(long value) { // + void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
//
//        for (int i = 0; i < list.length; i = i + 1) {
//            list = new long[list.length + 1];
//            list[list.length - 1] = value;
//
//
//        }
//    }
//    public void add2(long value) {
//        for (long array : list) {
//            list = new long[list.length + 1];
//            list[list.length - 1] = value;
    }


    public static void main(String[] args) {
        AList1 list1 = new AList1();
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1);
    }

    @Override
    public String toString() {
        return "AList1{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}

