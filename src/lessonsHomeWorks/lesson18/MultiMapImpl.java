package lessonsHomeWorks.lesson18;

import lessons.lesson18.MultiMap;

import java.util.*;


public class MultiMapImpl<K, V> implements MultiMap<K, V> {

    private HashMap<K, List<V>> multiMap = new HashMap<>();

    @Override
    public int countValues(K key) {
        List<V> values = multiMap.get(key);
        int count = values.size();
        return count;
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
            List<V> values = multiMap.get(key);
            if (values.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            return values.get(values.size() - 1);
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            List<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Iterator<V> valuesIterator(K key) { //НЕ РАБОТАЕТ!
//        Iterator<List<V>> iter = multiMap.values().iterator();
//        while (iter.hasNext()) {
//            if (multiMap.containsKey(key)) {
//                iter.next();
//            }
//        }
//        return (Iterator<V>) iter;
//    }
        Iterator<V> iterator = multiMap.get(key).iterator();
        return iterator;
    }

//    public Iterator<V> valuesIterator2(K key) {//НЕ РАБОТАЕТ!
//        List<V> values = new ArrayList<>();
//        Iterator<V> iter = values.iterator();
//        while (iter.hasNext()) {
//            if (values.contains(key)) {
//                iter.next();
//            }
//        }
//        return iter;
//    }


    @Override
    public V remove(Object key) {
        List<V> values = multiMap.remove(key);
        return null; //что должен вернуть?

//        public V remove(Object key) { // у тебя твой метод возвращает текстовую переменную, преобразованную к типу значения
//            if(multiMap.containsKey(key)) {
//                ArrayList<V> values = multiMap.remove(key);
//                return (V) ("Значения по  ключу  " + key +  "  удалены");
//            }
//            return null;
//        }
    }

    @Override
            public void putAll(Map<? extends K, ? extends V> m) throws NullPointerException{
            if (m.containsKey(null) || m.containsValue(null)) {
                throw new NullPointerException("Коллекция содержит значения null");
            }
            Set<? extends K> keys = m.keySet();
            for (K k : keys) {
                if (multiMap.containsKey(k)) {
                   List<V> valuesMultiMap = multiMap.get(k);
                    V valueM = m.get(k);
                    valuesMultiMap.add(valueM);
                    multiMap.put(k, valuesMultiMap);
                } else {
                 List<V> values = new ArrayList<>();
                    V valueM = m.get(k);
                    values.add(valueM);
                    multiMap.put(k, values);
                }
            }
        }
//        for (Entry<? extends K, ? extends V> e : m.entrySet()) { не работает
//            K key = e.getKey();
//            V value = e.getValue();
//            List<V> values = multiMap.put(key, (List<V>) value);
//            multiMap.put(key, (List<V>) value);
//        }
//    }

    @Override
    public void clear() {
        multiMap.clear();

    }

    @Override
    public Set<K> keySet() {
        return multiMap.keySet();
    }

    @Override
    public Collection<V> values() {
        return (Collection<V>) multiMap.values();
    }

    @Override
    public Set<Entry<K, V>> entrySet() { //??? Returns a Set view of the mappings contained in this map - это вывод на экран? Если да, то работет корректно
        Set<Entry<K, List<V>>> set;
        set = multiMap.entrySet();
        for (Entry<K, List<V>> entry : set) {
            System.out.printf("Key: %5s, Value = %10s\n", entry.getKey(), entry.getValue());
        }
        return null;
    }

}
//    Set set = multiMap.entrySet();
//                return set;