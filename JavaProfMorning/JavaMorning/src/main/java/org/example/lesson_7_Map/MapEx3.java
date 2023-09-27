package org.example.lesson_7_Map;

import java.util.*;

public class MapEx3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("rer","fgd","yuyu");
        Map<Integer, List<String>> listMap = new HashMap<>();
        listMap.put(1, list1);

        System.out.println(listMap);
    }
}
