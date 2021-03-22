package lessonsHomeWorks.studentsWorks.Anton;

import lessons.lesson18.MultiMap;

import java.util.*;

public class MultiMapImpl<K, V> implements MultiMap<K, V> {
    private HashMap<K, ArrayList<V>> multiMap = new HashMap<>();

    @Override
    public int countValues(K key) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            return values.size();
        }
        return 0;
    }

    @Override
    public int size() {
        return multiMap.size();
    }

    @Override
    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return multiMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for (K key : multiMap.keySet()) {
            ArrayList<V> values = multiMap.get(key);
            if (values.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            return values.get(values.size() - 1);
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        Iterator<V> iterator = multiMap.get(key).iterator();
        return iterator;
    }

    @Override
    public V remove(Object key) {
        if(multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.remove(key);
            return (V) ("Значения по  ключу  " + key +  "  удалены");
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) throws NullPointerException{
        if (m.containsKey(null) || m.containsValue(null)) {
            throw new NullPointerException("Коллекция содержит значения null");
        }
        Set<? extends K> keys = m.keySet();
        for (K k : keys) {
            if (multiMap.containsKey(k)) {
                ArrayList<V> valuesMultiMap = multiMap.get(k);
                V valueM = m.get(k);
                valuesMultiMap.add(valueM);
                multiMap.put(k, valuesMultiMap);
            } else {
                ArrayList<V> values = new ArrayList<>();
                V valueM = m.get(k);
                values.add(valueM);
                multiMap.put(k, values);
            }
        }
    }

    @Override
    public void clear() {
        multiMap.clear();
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = multiMap.keySet();
        return keys;
    }

    @Override
    public Collection<V> values() {
        return (Collection<V>) multiMap.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set set = multiMap.entrySet();
                return set;
    }
}
