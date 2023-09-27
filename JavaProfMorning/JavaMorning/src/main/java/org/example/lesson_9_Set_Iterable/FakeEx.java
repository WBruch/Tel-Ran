package org.example.lesson_9_Set_Iterable;

import com.github.javafaker.Faker;

public class FakeEx {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 3; i++) {

            System.out.println(faker.address().country());
        }
    }
}
