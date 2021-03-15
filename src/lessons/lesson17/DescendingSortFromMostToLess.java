package lessons.lesson17;

import java.util.Comparator;

public class DescendingSortFromMostToLess implements Comparator<Integer> {// если бы мы были в Integer и он сравнивали себя(Integer), то использовали бы интерфейс Comparable.
// но у нас нет доступа в Integer для переопределения, а извне мы можем использовать только интерфейс Comparator, программа требует имплементировать методы,
// мы выбираем только один метод - compareTo с указанием двух чисел int, которые мы будем сравнивать)

    @Override
    public int compare(Integer o1, Integer o2) { // есть 2 варианта: либо вставить сюда тернарный оператор из compareTo из класса Integer: return (x < y) ? -1 : ((x == y) ? 0 : 1);
//либо:
        return o2-o1; // переопределяем по убыванию, а не по возрастанию, меняем местами o2 и o1
    }
}

