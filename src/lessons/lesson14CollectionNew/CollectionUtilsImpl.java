package lessons.lesson14CollectionNew;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException { //все переменные метода(а, и, куыгде) видны только внутри метода
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>(); //с дубликатами
        for (Integer num : a) {//Integer num - каждый элемент коллекции а, проходимся по всей коллекции
            if (b.contains(num)) { //если коллекция b содержит такой же элемент, то
                result.add(num); // добавить этот элемент
            }
        }
        for (Integer num : b) {// то же самое по второй коллекции
            if (a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : a) {//Integer num - каждый элемент коллекции а, проходимся по всей коллекции
            if (b.contains(num)) { //если коллекция b содержит такой же элемент, то
                result.add(num); // добавить этот элемент
            }
        }
        for (Integer num : b) {// то же самое по второй коллекции
            if (a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>(); //с дубликатами
        // foreach
        for (Integer num : a) {//Integer num - каждый элемент коллекции а, проходимся по всей коллекции
            if (!b.contains(num)) { //если коллекция b НЕ содержит такого же элемента, то
                result.add(num); // добавить этот элемент
            }
        }
            for (Integer num : b) {// то же самое по второй коллекции
                if (!a.contains(num)) {
                    result.add(num);
                }
            }
            return result;
        }


    @Override
    public Collection<Integer> differenceWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>(); //исключает дубликаты, оставляет один из двух одинаковых
        for (Integer num : a) {//Integer num - каждый элемент коллекции а, проходимся по всей коллекции
            if (!b.contains(num)) { //если коллекция b НЕ содержит такого же элемента, то
                result.add(num); // добавить этот элемент
            }
        }
        for (Integer num : b) {// то же самое по второй коллекции
            if (!a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}

/*   /* 8 способов итерации в коллекциях
        import java.util.Arrays;
        import java.util.Iterator;
        import java.util.List;


     List<String> colors = Arrays.asList("red", "yellow",  "blue", "black", "orange", "white","green");

            // Basic loop
            for (int i = 0; i < colors.size(); i++) {
                String color = colors.get(i);
                printItemList(color);
            }


            // foreach
            for (String color : colors) {
                printItemList(color);
            }

            // Basic loop with iterator
            for (Iterator<String> it = colors.iterator(); it.hasNext(); ) {
                String color = it.next();
                printItemList(color);
            }

            // Iterator with while loop
            Iterator<String> it = colors.iterator();
            while (it.hasNext()) {
                String color = it.next();
                printItemList(color);
            }

            // JDK 8 streaming example lambda expression
            colors.stream().forEach(color -> printItemList(color));

            // JDK 8 streaming example method reference
            colors.stream().forEach(ListExample::printItemList);

            // JDK 8 for each with lambda
            colors.forEach(color -> printItemList(color));

            // JDK 8 for each
            colors.forEach(ListExample::printItemList);
        }

        private static void printItemList(String color) {
            System.out.println("color: " + color);
        }

    }
    */