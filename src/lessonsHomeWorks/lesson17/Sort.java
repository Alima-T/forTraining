package lessonsHomeWorks.lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(30);
        list.add(74);
        list.add(44);
        list.add(33);
        list.add(14);
        list.add(3);
        list.add(4);

        Collections.sort(list, new Comparator<Integer>() {//создаем внутренний безымянный класс и {тело}, чтобы не создавать отдельный класc
            // изменяем return как нам нужно.
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}
