package summaryFriday.sum_22_09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1234, "Ivan Ivanov");
        map.put(3461, "Petr Petrov");
        map.put(1261, "John Silver");

        System.out.println(map.get(1261));

        Set<Integer> keys = map.keySet();
        for (Integer k :
                keys) {
            System.out.println(k);
        }

        System.out.println(map.values());

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e:
             entries) {
            System.out.println("Key - " + e.getKey() + "| Value - " + e.getValue());
        }
    }
}
