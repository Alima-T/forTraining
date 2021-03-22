package daytelsJava.GenericCollections18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {

    public static void main(String[] args) {
//remove colors that are not included in the CMYK color model
        String[] colors = {"Magenta", "Red", "White", "Blue", "Cyan", "Yellow", "Key(Black)"};
        //add elements in colors array to list
        List<String> list = new ArrayList<String>();
        for (String color : colors) { // new variable String color will pass through array colors
            list.add(color); //adds color to end of list
        }// add elements in removeColors  to removeList

        String[] removeColors = {"Red", "White", "Blue"};
        List<String> removeList = new ArrayList<String>();
        for (String removeColor : removeColors) {
            removeList.add(removeColor);
        }
        System.out.printf("ArrayList before removing: \n" + "%s  \n\n", list);
        System.out.printf("ArrayList with colors for removing: \n" + "%s  \n\n", removeList);

        //remove from list colors contained in removelist
        removeColor(list, removeList);
        System.out.println("ArrayList after removing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i)); // output list contents
        }
        System.out.println();
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println("\n");

        String[] colors2 = {"Lylic"};
        List<String> colorsList2 = new ArrayList<String>();
        for (String color2 : colors2) {
            colorsList2.add(color2);
            list.add(color2);
        }
        System.out.printf("ArrayList: \n" + "%s  \n\n", list);

        removeColor(list, colorsList2);
        System.out.println("ArrayList after removing: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i)); // output list contents
        }

    }


    // remove colors specified in collection2 from collection1
    public static void removeColor(Collection<String> collection1, Collection<String> collection2) {
        //get iterator
        Iterator<String> iterator = collection1.iterator();
        //loop while collection has items
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();// remove current color
            }
        }
    }

    /**
     * Common Programming Error 18.1
     *     If a collection is modified by one of its methods after an iterator is created for that collection,
     *     the iterator immediately becomes invalid—operations performed with the iterator
     *     after this point throw ConcurrentModificationExceptions. For this reason, iterators
     *     are said to be “fail fast.”
      */

}




