package lessons.lesson14CollectionNew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollectionUtils {
    public static void main(String[] args) {
        // можно любой из коллекций: AbstractCollection<Integer> nums1 = new ArrayList<>(), но этим мы обрезаем себе доступ кметодам нижнего уровня,
        // т.е чем ниже по иерарахии класс(интерфейс), от которого мы создаем объект тем больше методов имеет в доступе от родителей
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(1);
        nums1.add(3);
        nums1.add(4);

        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();

        Collection<Integer> result = utils.union(nums1,nums2);
        System.out.println(result);

        Collection<Integer> result1 = utils.intersection(nums1,nums2);
        System.out.println(result1);

        Collection<Integer> result2 = utils.intersectionWithoutDuplicate(nums1,nums2);
        System.out.println(result2);

        Collection<Integer> result3 = utils.difference(nums1,nums2);
        System.out.println(result3);

        Collection<Integer> result4 = utils.differenceWithoutDuplicate(nums1,nums2);
        System.out.println(result4);

    }
}
