package org.example.lesson_2_Enum;


public class Person {

    String name;

    int age;

    Animal animal;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal = new Animal();
        Person person = new Person("mal",34,dog1);
    }
}

class Animal{

}


class Dog extends Animal{
    String name;
}

class Cat extends Animal{
    String name;
}