package org.example.lesson_18_FileInputStream_OutputStream.serial;

import java.io.Serializable;

public class Person777 implements Serializable {
    private String name;
    private transient int age;

    public Person777(String name, int age) {
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
        return "Person777{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
