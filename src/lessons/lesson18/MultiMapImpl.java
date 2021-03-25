package lessons.lesson18;

import java.util.*;

// программирование в виде омпозиции, класс Авто - наследник Мерседес - композиции: аргументы, которые уже готовы:  колоеса (4 колеса сдисками и шинами),  двигатель (с множеством деталей внутри)
// мы внутри нашего multiMap делаем композицию и внутренность лепим из HashMap, т.к. он нам идеально подходит, берем объект HashMap и из него лепим и переделываем методы как нам надо.
public class MultiMapImpl<K, V> implements MultiMap<K, V> { // Сначала указать <K,V> - динамический тип, который при создании нашей MultiMap,
    // и только после этого генерируем(имплементируем) все методы, которые придут с <K,V>   если кто-то установит тип, например, String и V  Integer,
    // то именно эти типы и будут везде установлены вместо <K,V> / поэтому если в интерфейсе указано <K,V>, то и в имплементации тоже должно быть <K,V>
    // мы не берем  потому что с нимпритянутся все его методы, нам не нужны все его методы.

    private HashMap<K, List<V>> multiMap = new HashMap<>();//делаем композицию, объявляем HashMap и берем все методы, которые устраивают нас и переопределяем их. HashMap, т.к. он нам идеально подходит,
    // <K, ArrayList<V>> - один ключ и много значений (или <K, List<V>>), т.к. мы не можем написать <K,V,V> т.к. в Map допускается один ключ и одно значение, то в значение кладем коллекцию.
    // переделываем методы как нам надо и берем все его свойства, которые нас устраивают, устанавливаем поля.
    // Мы не могли взять HashMap в родители, т.к. нам бы пришло все, нам все не подходит, нам бы пришлось все смотреть и переопределять.

    @Override
    public int countValues(K key) { //Возвращает количество значений для указанного ключа
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            int count = values.size();
            return count;
        }return 0;
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
        for (K key : multiMap.keySet()) { //текущий ключ key Типа K : массив, по которму мы хотим пройтись, здесь цикл пройдет по каждому
            List<V> values = multiMap.get(key); //и по каждому ключу достанет множество всех значений
            if (values.contains(value)) { //если в множестве значений найдется указанное в параметрах значение value
                return true;
            }
        }

        return false; // до сюда доходит если только не нашлось значения и не вернулся true выше
    }

    @Override
    public V get(Object key) { // нужно вернуть последнее значние по ключу, рассуждать как грамотный тестировщик и сразу предусматривать все варианты, использовать if else
        if (multiMap.containsKey(key)) { // если такой ключ содержится, достаем его значения по ключу и отдаем последнее значение по ключу
            List<V> values = multiMap.get(key); //и по каждому ключу достаем множество всех значений
            return values.get(values.size() - 1); //последнее значние по ключу
        }
        return null;//в случае если нет объекта по такому ключу, то нам нечего возвращать, возвращаем null
    }

    @Override
    public V put(K key, V value) { // if else - чтобы положить новое значение нужно сначала проверить, нет ли уже такого значения
        if (multiMap.containsKey(key)) { //достаем всю коллекциюпо по данному ключу "Иванов" и добавить еще один номер и сохранить эту коллекцию
            List<V> values = multiMap.get(key);//нам нужно достать values - get, а достаем мы из multiMap поэтому не нью, а multiMap.get/ выбирая get смотрим возвращаемый тип, должен сответствовать типу переменной values
            values.add(value); //добавляем значение, указанное нам в параметрах
            multiMap.put(key, values); //когда мы добавили новое значение, мы кладем обратно коллекцию values по этому ключу.
        } else {
            List<V> values = new ArrayList<>();//  если такого значение нет, то создаем новую коллекцию, чтобы не перезатирать, разместить там тот номер, который мы достали
            values.add(value); //добавляем новое значение
            multiMap.put(key, values); // кладем коллекцию values по ключу обратно в multiMap
        }
        return value; // не понятно зачем здесь ретерн, и что должен возвращать, по идее должен быть void, согласно Map пишем Null или value, возвращает предыдущее значение
    }


    @Override
    public Iterator<V> valuesIterator(K key) {
        Iterator<List<V>> iter = multiMap.values().iterator();
        while (iter.hasNext()) {
            if (multiMap.containsKey(key)) {
                iter.next();
            }
        }
        return (Iterator<V>) iter;
    }

    public Iterator<V> valuesIterator2(K key) {
        List<V> values = new ArrayList<>();
        Iterator<V> iter = values.iterator();
        while (iter.hasNext()) {
            if (values.contains(key)) {
                iter.next();
            }
        }
        return iter;
    }
//    public Iterator<V> valuesIterator(K key) {
//        Iterator<V> iterator = multiMap.get(key).iterator();
//        return iterator;
//    }

    @Override
    public V remove(Object key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.remove(key);
        }return null;
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
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, List<V>>> set;
        set = multiMap.entrySet();
        for (Entry<K, List<V>> entry : set) {
            System.out.printf("Key: %5s, Value = %10s\n", entry.getKey(), entry.getValue());

        }
        return null;
    }

}