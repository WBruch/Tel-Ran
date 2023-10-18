package org.example.lesson_16_ParamMethods;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        /**
         * Collectors - collect to DataStructure
         * Collections
         */

        List<String> list = Stream.of("A","G","Y","K").collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7, 5, 4, 3).collect(Collectors.toSet());
        System.out.println(set);

        Map<Integer, String> map = Stream.of("mama","mylas","ram")
                .collect(Collectors.toMap(String::length, el -> el));
        System.out.println(map);


        MyCollection<Dog> dogMyCollection = Stream.of(
                new Dog(FAKER.funnyName().name(),5),
                new Dog(FAKER.funnyName().name(),4),
                new Dog(FAKER.funnyName().name(),3),
                new Dog(FAKER.funnyName().name(),65),
                new Dog(FAKER.funnyName().name(),1)
//        ).collect(MyCollection::new, MyCollection::add, MyCollection::addAll);
        ).collect(() -> new MyCollection<>(), (collect, el) -> collect.add(el), (collection1, collection2) -> collection1.addAll(collection2));
        System.out.println(dogMyCollection);


        List<String> list1 = Stream.of("mama","mylas","ram","mama","mylas")
                .collect(Collectors.collectingAndThen(Collectors.toSet(), ArrayList::new));
        System.out.println(list1);
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MyCollection<T> extends ArrayList{

}