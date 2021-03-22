package lessonsHomeWorks.studentsWorks.Anton;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> fridje = new HashMap<>();
        fridje.put("Груша", 2);
        fridje.put("Слива", 5);
        fridje.put("Яблоко", 3);

        fridje.put("Груша", 4 + fridje.get("Груша"));
        int mass = 0;
        for(Integer value:fridje.values())
            mass += value;

        Set<Map.Entry <String, Integer>> entries = fridje.entrySet();
        for(Map.Entry <String, Integer> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
        System.out.println(mass);
        System.out.println(fridje);
    }
}
