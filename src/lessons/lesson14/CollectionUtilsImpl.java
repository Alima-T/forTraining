package lessons.lesson14;


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
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
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
        }return result;
    }
}
