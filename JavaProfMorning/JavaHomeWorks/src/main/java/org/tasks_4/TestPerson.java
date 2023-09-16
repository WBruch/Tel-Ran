package org.tasks_4;

import java.util.Objects;

public class TestPerson implements Comparable<TestPerson> {
    String name;
    int age;

    String locationCity;

    public TestPerson() {
    }

    public TestPerson(int age) {
        this.age = age;
    }

    public TestPerson(String name, int age, String locationCity) {
        this.name = name;
        this.age = age;
        this.locationCity = locationCity;
    }

    @Override
    public String toString() {
        return "TestPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", locationCity='" + locationCity + '\'' +
                '}';
    }

    @Override
    public int compareTo(TestPerson o) {
        if (this.age != o.age) {
            return this.age - o.age;
        } else if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else return this.locationCity.compareTo(o.locationCity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPerson that = (TestPerson) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(locationCity, that.locationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, locationCity);
    }
}
