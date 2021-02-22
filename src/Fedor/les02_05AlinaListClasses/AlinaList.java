package Fedor.les02_05AlinaListClasses;

import static org.junit.Assert.*;


/**
 * Класс для хранения списка целочисленных значений типа long.
 */
public class AlinaList implements IList {

    /*Если хочешь задачу с классом, то вот тебе задача. Создай класс, который позволяет хранить список long во внутреннем массиве long[],
    при этом у него есть методы void add(long value), long get(int index), int size(), int indexOf(long value), void clear()
    если размера внутреннего массива перестает хватать, надо заменить его бОльшим массивом и скопировать в него все старые значения
    Класс назови AlinaList
            да, массив
    я хочу, чтобы ты создала класс, внутри которого есть массив, и все манипуляции с этим массивом выполняла через методы класса
    + void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
    + long get(int index) - возвращает значение из списка текущего экземпляра с позицией index
    int size() - возвращает количество элементов, сохраненных в списке текущего экземпляра
    int indexOf(long value) - возвращает позицию указанного значения в списке текущего экземпляра
    void clear() - опустошает список текущего экземпляра
    + indexOf - ты делала вчера только*/

    long[] list = new long[0];

    @Override
    public void add(long value) {
        for (long array : list) { // - foreach это разновидность цикла for, которая используется, когда нужно обработать все элементы массива (каждый) или коллекции.
            list = new long[list.length + (int) value]; // нужно не 1 а value
            System.out.println(array);
            break;
        }
    }

    @Override
    public long get(int index) {
        for (int i = 0; i < list.length; i++) {
            if (index == list[i]) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < list.length; i++) {
            //boolean // list[i] > 0 -  расписать подробно
            if (list[i] > 0) {
                size = size + 1;
            }
        }
        return size;
    }

    @Override
    public void clear() {
        for (long array:list) {
            list = new long[0];
        }
    }

    @Override
    public int indexOf(long value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // TDD - Test Driven Development
    public static void main(String[] args) {
        final MyClass myClassInstance = new MyClass();
        myClassInstance.put(50, 574875);
        System.out.println(myClassInstance.get(50));

        extracted();
    }

    private static void extracted() {
        final IList list1 = new AlinaList();
        assertTrue(list1.size() == 0);
        list1.add(13);
        list1.add(16);
        list1.add(17);
        list1.add(13);
        list1.add(1223);
        assertTrue(list1.size() == 5);
        list1.add(13);
        assertTrue(list1.size() == 6);
        assertTrue(list1.indexOf(16) == 1);
        assertTrue(list1.indexOf(13) == 0);
        assertTrue(list1.get(3) == 13);
        list1.clear();
        assertTrue(list1.size() == 0);
        try {
            list1.get(0);
            throw new RuntimeException("Предполагается исключение IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException ex) {
        }
    }

}

class MyClass {
    // класс выделяет область в памяти 1 байт (byte b) + 4 байта (int a) + 8 байтов (для массива,т.к. переменная массива хранит ссылку на этот массив, а все ссылки хранятся в типе long, т.е. 8 байтов)
    byte b;
    int a;
    private long [] array = new long[10];

    public void put(int index, long valueToPut){
        array[index] = valueToPut;
    }

    public long get(int index){
        long element = array[index];
        return element;
    }

}


