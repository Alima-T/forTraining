package lessonsHomeWorks.lesson18;

import lessons.lesson18.MultiMapImpl;


    public class TestMultiMap {
        public static void main(String[] args) {


            lessons.lesson18.MultiMapImpl<String, String> phoneBook = new lessons.lesson18.MultiMapImpl<>();
            phoneBook.put("Ivanov", "+7-987-987-00-01");
            phoneBook.put("Ivanov", "+7-987-987-00-01");
            phoneBook.put("Ivanov", "+7-987-987-00-02");
            phoneBook.put("Petrov", "+7-987-987-00-03");
            phoneBook.put("Sidorov", "+7-987-987-00-04");
            phoneBook.put("Sokolov", "+7-987-987-00-05");

            lessons.lesson18.MultiMapImpl<String, String> phoneBook2 = new MultiMapImpl<>();
            phoneBook2.put("Ivanov", "+7-987-987-11-01");
            phoneBook2.put("Popov", "+7-987-987-11-02");
            phoneBook2.put("Veselov", "+7-987-987-11-03");
            phoneBook2.put("Drosdov", "+7-987-987-11-04");

            System.out.println(phoneBook.countValues("Ivanov"));
            System.out.println((phoneBook.size()));
            System.out.println((phoneBook.isEmpty()));
            System.out.println(phoneBook.containsKey("Petrov"));
            System.out.println(phoneBook.containsKey("Petrova"));
            System.out.println(phoneBook.containsValue("+7-987-987-12-12"));
            System.out.println(phoneBook.containsValue("+7-987-987-12-00"));
            System.out.println(phoneBook.get("Ivanov"));
            System.out.println(phoneBook.valuesIterator("Petrov")); //2 варианта, оба работают НЕкорректно
            System.out.println(phoneBook.valuesIterator2("Petrov"));
            System.out.println(phoneBook.remove("Sokolov"));
            System.out.println(phoneBook.keySet());
            System.out.println(phoneBook.values());
            phoneBook.entrySet(); // что значит "returns a set view"? у меня return null, но на консоль выводит корректно

            System.out.println("_____________");

            phoneBook.putAll(phoneBook2);//на консоли видно, что добавилась вторая Map, но теперь только она, а предыдущей, к которой добавлялась, нет.
            phoneBook.entrySet();
        }

    }