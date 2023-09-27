package org.example.lesson_4_Comparator_Casting;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }

    //p1.compareTo(p2)
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

class SalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

class Main11 {
    public static void main(String[] args) {
        Person p1 = new Person("Nikolas", 25, 7850);
        Person p2 = new Person("Mik", 21, 11156);
        Person p3 = new Person("Olga", 31, 2580);
        Person p4 = new Person("Masha", 42, 452);

//        Person[] people = {p1, p2, p3, p4};
//        System.out.println(Arrays.toString(people));
//
//        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        System.out.println(personList);

        Collections.sort(personList, new SalaryComparator());

        System.out.println(personList);
    }


}