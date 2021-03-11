package lessons.lesson13CollectionsArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList02_25 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>(); // переписывает всю коллекцию в новую коллекцию если нужно сдвинуть или увеличить размер.
        texts.add("qqq"); // добавить
        texts.add("www");
        texts.add("aaa");
        texts.add("sss");

        texts.add(0,"!!!"); // добавить элемент по индексу
        texts.set(1,"QQQ"); // заменить элемент по индексу




        System.out.println(texts.size());
        System.out.println(texts);
        System.out.println(texts.toString());
        System.out.println(texts.contains("!!!")); // долго,т.к. читает всю коллекцию
        System.out.println(texts.contains("!"));
        System.out.println(texts.get(0)); // достать копию, не вынимая его из коллекции / быстро, т.к. не перечитывает всю строку
        System.out.println(texts.remove(0)); // удалить элемент по индексу - достает не копию, а сам элемент, при этом он стирается из коллекции
        System.out.println(texts.remove("!!!")); // удалить объект элемент - по содержанию / долго, т.к. переписывает всю коллекцию при удалении одного элемента.

        LinkedList<String> linkedList = new LinkedList<>(); //Все методы, кроме get отрабатывают бустрее чем в ArrayList
        System.out.println(texts.get(0)); // очень долго, т.к поиск отрабатывает всегда делением на 2. Разница колоссальная.
    }

}
