package org.example.lesson_9_Set_Iterable.taski;

import com.github.javafaker.Faker;

public class PersonGenerator {
    private static final Faker faker = new Faker();

    public static Person[] persons() {
        Person[] per = new Person[10];
        for (int i = 0; i < 10; i++) {
            per[i] = new Person();
            per[i].setName(faker.name().fullName());
            per[i].setAge(faker.random().nextInt(18, 22));
            per[i].setLocation(faker.address().city());
            per[i].setMarried(faker.random().nextBoolean());
        }
        return per;
    }
}
