package org.example.lesson_9_Set_Iterable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');

        System.out.println(list);

        ListIterator<Character> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println();
        System.out.println("************************************");
        ListIterator<Character> listIteratorReverse = list.listIterator(list.size());
        while (listIteratorReverse.hasPrevious()) {
            System.out.print(listIteratorReverse.previous());
        }


    }
}
