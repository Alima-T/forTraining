package Fedor.les02_05AlinaListClasses;

import static org.junit.Assert.assertTrue;


/**
 * Класс для хранения списка целочисленных значений типа long.
 */
public class AlinaList implements IList {

    long[] list = new long[0];

    @Override
    /**
     * Добавляет новое значение в список
     * @param value добавляемое в список значение
     */
    public void add(long value) { // + void add(long value) - добавляет в список текущего экземпляра (объекта) новое значение value
        long[] newList = new long[list.length + 1]; //
        for (int i = 0; i < list.length; i = i + 1) {
            newList[i] = list[i];
        }
        newList[newList.length - 1] = value;
        list = newList;
    }

    @Override
    /**
     * Предоставляет значение из списка по индексу
     * @param index - индекс получаемого элемента списка
     * @return значение элемента с указанным индексом
     */
    public long get(int index) {
        long element = list[index];
        for (int i = 0; i < list.length; i++) {
            if (index == list[i])
                return i;
        }
        return element;
    }

    @Override
    /**
     * Предоставляет размер списка
     * @return количество элементов в списке
     */
    public int size() {
        int size = list.length;
        return size;
    }

    @Override
    /**
     * Очищает список
     */
    public void clear() {
        for (long array : list) {
            list = new long[0];
        }
    }

    @Override
    /**
     * Предоставляет индекс первого элемента списка по указанному значению
     * @param value - значение элемента списка
     * @return - индекс первого найденного элемента с указанным значением
     */
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

