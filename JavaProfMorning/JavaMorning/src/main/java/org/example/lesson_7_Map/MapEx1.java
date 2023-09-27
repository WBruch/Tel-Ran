package org.example.lesson_7_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Nik");
        map.put(2,"Touk");
        map.put(null,"Touk");
        map.put(16,"John");
        map.put(65,"Olga");
        map.put(45,"Moe");
        map.put(6,null);

        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
