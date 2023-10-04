package org.example.lesson_11_stackExample;

import org.example.lesson_11_stackExample.cat.Cat;

import java.util.ArrayDeque;

public class DequeExmp {
    public static void main(String[] args) {
        ArrayDeque<Cat> arrayDeque = new ArrayDeque<>();

        Cat firstCat = new Cat(1,"Tom cat");
        Cat secondtCat = new Cat(1,"Barsik cat");
        Cat thirdCat = new Cat(10,"Haron");

        arrayDeque.add(firstCat);
        arrayDeque.addLast(secondtCat);

        System.out.println(arrayDeque.removeLast());
        System.out.println("__________________________");

        System.out.println(arrayDeque.size());
        System.out.println(arrayDeque.getLast());

        arrayDeque.addFirst(thirdCat);
        System.out.println("__________________________");

        System.out.println(arrayDeque.getFirst());

    }
}
