package de.telran.practice1.incapsulation.classwork;

import de.telran.practice1.incapsulation.classwork.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 5);
        System.out.println("Field name = " + animal.name); //not compile, because name is private!
        System.out.println("Field age = " + animal.age); //not compile, because age is private!

        System.out.println("Getter return animal name = " + animal.getName());
        System.out.println("Getter return animal age = " + animal.getAge());
    }
}
