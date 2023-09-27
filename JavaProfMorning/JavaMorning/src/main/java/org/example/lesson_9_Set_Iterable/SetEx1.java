package org.example.lesson_9_Set_Iterable;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        List<Integer> listI = new LinkedList<>();
        listI.add(1);
        listI.add(3);
        listI.add(7);
        listI.add(8);



        Set<Integer> set = new TreeSet<>();
        set.add(500);
        set.add(5);
        set.add(53);
        set.add(50);
        set.add(50);
        set.add(53);
        set.add(5);
        System.out.println(set);
    }
}
