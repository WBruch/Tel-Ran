package summaryFriday.sum_29_09;

import java.util.*;

public class SetAndMapExamples {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Mary");
        names.add("Tom");
        names.add("Mary");
        names.add("Mary");

        System.out.println(names);
        System.out.println("*********************");

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Two", 40);
        map.put("Three", 3);

        System.out.println(map.get("Two"));
        System.out.println("*********************");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> current :
                entries) {
            System.out.println(current.getKey() + " " + current.getValue());
        }
        System.out.println("*********************");

        Set<String> animals = new TreeSet<>();
        animals.add("monkey");
        animals.add("cat");
        animals.add("dog");
        animals.add("sparrow");
        animals.add("elephant");

        for (String str :
                animals) {
            System.out.println(str);
        }
        System.out.println("*********************");


    }

}
