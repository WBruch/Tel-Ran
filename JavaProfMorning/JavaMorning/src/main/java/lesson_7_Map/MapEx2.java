package lesson_7_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 54, 32, 90, 78);
        for (Integer i :
                list) {
            System.out.println("Element: " + i);
        }


        int[] arr = {12, 3, 167, 87, 54, 0};
        for (int a :
                arr) {
            System.out.println("arr element: " + a);
        }

        Map<String, String> map = new HashMap<>();
        map.put("+34 64354", "Mik");
        map.put("+5 454644", "Joe");
        map.put("+49 6439854", "Nik");
        map.put("+7 64234354", "Olga");
        map.put("+373 6406354", "Jane");
        map.put("+38 64111354", "Paul");
        map.put("+1 640800354", "Monica");
// po param
        for (Map.Entry<String,String> m:
             map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " | " + "Val: " + m.getValue());
        }
// po klu4am
        for (String s:
             map.keySet()) {
            System.out.println("Map keys: " + s);
        }

// po zna4eniu
        for (String s:
                map.values()) {
            System.out.println("Map values: " + s);
        }



    }
}
