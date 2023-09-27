package org.example.lesson_9_Set_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(list);
    }
}
