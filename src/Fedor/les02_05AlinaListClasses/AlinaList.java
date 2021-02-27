package Fedor.les02_05AlinaListClasses;

import static org.junit.Assert.assertTrue;


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
//    public void add(long value) {
//        list = new long[list.length + 1];
//        list[list.length - 1] = value;

//    }
    public void add(long value) { // + void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
        long[] newList = new long[list.length + 1]; //
        for (int i = 0; i < list.length; i = i + 1) {
            newList[i] = list[i];
        }
        newList[newList.length - 1] = value;
        list = newList;
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
        int size = list.length;
        return size;
    }

    @Override
    public void clear() {
        for (long array : list) {
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
        final IList list1 = new AlinaList();
        // assertTrue - проверка верности выражения
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
        list1.add(0);
        assertTrue(list1.size() == 1);
        try {
            list1.get(1);
            throw new RuntimeException("Предполагается исключение IndexOutOfBoundsException!");
        } catch (IndexOutOfBoundsException ex) {
        }
    }

}

