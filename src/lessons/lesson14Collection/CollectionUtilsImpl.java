package lessons.lesson14Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result1 = new ArrayList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                result1.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                result1.add(num);

            }
        }
        return result1;
    }

    public Collection<Integer> intersection2(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result2 = new ArrayList<>();
        result2.addAll(a);
        result2.retainAll(b);
        result2.addAll(b);
        result2.retainAll(a);
        return result2;
    } // retainAll(Collection c) — удаляет элементы, не принадлежащие переданной коллекции - removes from this list all of its elements that are not contained in the specified collection.

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

    //removeAll(Collection c) — удаляет элементы, принадлежащие переданной коллекции
    public Collection<Integer> remove(Collection<Integer> a, Collection<Integer> b) throws NullPointerException{
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.removeAll(b);
        result.addAll(b);
        result.removeAll(a);
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

        CollectionUtilsImpl utils = new CollectionUtilsImpl(); //поскольку метод union в класссе CollectionUtilsImpl НЕ static, мы создаем объект этого класса,
        // если бы был static , то можно было бы сразу к нему обращаться без создания объекта
        Collection<Integer> result = utils.union(nums1, nums2); //смотрим что возвращает метод union (возвращает тип Collection<Integer>) и прописываем его перед переменной result
        System.out.println(result);

        Collection<Integer> result1 = utils.intersection(nums1, nums2);
        System.out.println(result1);

        Collection<Integer>result2 = utils.intersection2(nums1,nums2);
        System.out.println(result2);

        Collection<Integer> result3 = utils.unionWithoutDuplicate(nums1, nums2);
        System.out.println(result3);

        Collection<Integer> result4 = utils.intersectionWithoutDuplicate(nums1, nums2);
        System.out.println(result4);

        Collection<Integer> result5 = utils.difference(nums1, nums2);
        System.out.println(result5);

        Collection<Integer> result6 = utils.remove(nums1, nums2);
        System.out.println(result6);
    }
}
