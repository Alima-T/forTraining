package lessons.lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main0 {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);

        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);

        CollectionUtilsImpl utils = new CollectionUtilsImpl(); //поскольку метод union в класссе CollectionUtilsImpl НЕ static, мы создаем объект этого класса,
        // если бы был static , то можно было бы сразу к нему обращаться без создания объекта
        Collection<Integer> result = utils.union(nums1, nums2); //смотрим что возвращает метод union (возвращает тип Collection<Integer>) и прописываем его перед переменной result
        System.out.println(result);

        Collection<Integer> result2 = utils.intersection(nums1, nums2);
        System.out.println(result2);

        Collection<Integer> result3 = utils.unionWithoutDuplicate(nums1, nums2);
        System.out.println(result3);

        Collection<Integer> result4 = utils.intersectionWithoutDuplicate(nums1, nums2);
        System.out.println(result4);

        Collection<Integer> result5 = utils.difference(nums1, nums2);
        System.out.println(result5);


    }
}
