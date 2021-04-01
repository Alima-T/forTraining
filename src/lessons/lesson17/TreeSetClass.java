package lessons.lesson17;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClass { //TreeSet - механизм хранения - бинарное дерево (см. в гугле, голова и две ветки(иногда пока еще одна ветка)), нет индексов, нет дубликатов.
    // При вхождении первого числа становится головой, все последующие при вхождении вызывают метод compareTo, и сравниваются все входящие с головной ячейкой:
    // если при сравнении дает 0, то не записывает, если меньше головной - влево, если больше - вправо

    public static void main(String[] args) {

//        TreeSet<Integer> nums = new TreeSet<> (new DescendingSortFromLessToMore());// внутри объекта new TreeSet<>  создаем новый объект - new DescendingSortFromLessToMore() { // new TreeSet<> - это вызов конструктора, по умолчанию в конструкторе находится способ сортировки compareTo из Integer.
//// если не передать способ сортировки, то будет отрабатываться он, поэтому нужно передать свой способ, для этого создать новый класс DescendingSortFromLessToMore и создать метод compare.

        // new TreeSet<> - это вызов конструктора, открываем скобки и пишем new выбираем Comparator<Integer>{...} (java.util),
        // где {...} (java.util) - означает создание объекта и целого внутреннего класса (безымянного) { с методом }  прямо внутри, остается только переопределить o2 и o1 по убыванию.
        // (если не передать способ сортировки, то будет отрабатывать способ по умолчанию (compareTo method) из Integer, который соритирует по возрастанию и мы не можем его переопределить)

        TreeSet<Integer> nums = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        nums.add(12);
        nums.add(45);
        nums.add(32);
        nums.add(12);
        nums.add(56);
        nums.add(23);
        nums.add(72);
        nums.add(12);
        nums.add(82);
        nums.add(16);
        nums.add(89);
        for(int n: nums){
            System.out.println(n);
        }
    }


}
