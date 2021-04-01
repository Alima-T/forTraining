package lessons.lesson14CollectionNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Груша", 8);
        fridge.put("Слива", 5);
        fridge.put("Яблоко", 3);

        //fridge.put("Груша", 6); если мы хотим добавить, то put не использовать т.к. он перезатирвает предыдущее значение по этому ключу)
        fridge.put("Груша", 6 + fridge.get("Груша")); //добавляет к Груше с прежним значением новое значение 6)

        int weight = 0;
        for(Integer value: fridge.values()) {
            weight= weight+value;
        }

        Set<Map.Entry<String,Integer>> entries = fridge.entrySet(); //кашолка с яйцами, которые состоят из белка и желтка
        for (Map.Entry<String,Integer>entry:entries){    // Map.Entry<String,Integer> - тип одного элемента entry из множества (Set) элементов entries
            System.out.println((entry.getKey()));
            System.out.println(entry.getValue());
          //  System.out.println(entry.setValue()); есть только setValue
        }

        System.out.println(weight);
        System.out.println(fridge);







    }
}
