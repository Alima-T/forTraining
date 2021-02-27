package lessons.lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) { // 100000 т.к. разница видна на больших оборотах, на маленьких нет смысла, не видно разницы или некорректный вывод
            arraylist.add("qweqwe" + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList ADD: " + (endTime1-startTime1));

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("qweqwe" + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("linkedList ADD: " + (endTime2-startTime2));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) { // 100000 т.к. разница видна на больших оборотах, на маленьких нет смысла, не видно разницы или некорректный вывод
            arraylist.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("ArrayList GET: " + (endTime3-startTime3));

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("linkedList GET: " + (endTime4-startTime4));
    }
}
