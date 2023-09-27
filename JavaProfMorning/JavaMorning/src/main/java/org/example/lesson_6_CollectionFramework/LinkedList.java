package org.example.lesson_6_CollectionFramework;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        List<Integer> list = new java.util.LinkedList<>();
        list.add(23);
        list.add(543);
        list.add(19);
        list.add(54);
        list.add(89);
        list.add(90);

        System.out.println(list);
    }
}
