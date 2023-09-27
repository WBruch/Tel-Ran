package org.example.lesson_9_Set_Iterable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Ob ob1 = new Ob("a", 23);
        Ob ob2 = new Ob("b", 23);
        Ob ob3 = new Ob("c", 23);
        Ob ob4 = new Ob("a", 45);
        Ob ob5 = new Ob("b", 45);
        Ob ob6 = new Ob("c", 45);


        Set<Ob> obs = new HashSet<>();
        obs.add(ob1);
        obs.add(ob2);
        obs.add(ob3);
        obs.add(ob4);
        obs.add(ob5);
        obs.add(ob6);

        System.out.println(obs);
    }
}

class Ob implements Comparable<Ob> {
    String name;
    int age;

    public Ob(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Ob o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ob ob = (Ob) o;
        return Objects.equals(name, ob.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Ob{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
