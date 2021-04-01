package lessonsHomeWorks.lesson14;


import lessons.lesson14Collection.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HomeWorkCollectionUtilsImplAlina implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
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
        for (Integer num : a) {
            if (b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                result.add(num);

            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                result.add(num);

            }
        }
        return result;
    }

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

        HomeWorkCollectionUtilsImplAlina utils = new HomeWorkCollectionUtilsImplAlina(); //поскольку метод union в класссе CollectionUtilsImpl НЕ static, мы создаем объект этого класса,
        // если бы был static , то можно было бы сразу к нему обращаться без создания объекта
        Collection<Integer> result1 = utils.union(nums1, nums2); //смотрим что возвращает метод union (возвращает тип Collection<Integer>) и прописываем его перед переменной result
        System.out.println(result1);

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
