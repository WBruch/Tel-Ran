package org.example.lesson_11_stackExample;

import org.example.lesson_11_stackExample.cat.Cat;

import java.util.Stack;

public class StackExmp {
    public static void main(String[] args) {
        Stack<Cat> stack = new Stack<>();
        System.out.println("________________________");
        System.out.println(stack.empty());
        System.out.println("________________________");

        Cat murka = new Cat(4, "Murka");
        stack.push(murka);
        System.out.println(stack.empty());
        System.out.println("________________________");

        Cat catFromStack = stack.peek();
        murka.setAge(15);
        System.out.println(catFromStack);
        System.out.println(stack.empty());
        System.out.println("________________________");

        Cat elementFromStack = stack.pop();
        System.out.println("Your cat is: " + elementFromStack);
        System.out.println(stack.empty());
        System.out.println("________________________");
    }
}
