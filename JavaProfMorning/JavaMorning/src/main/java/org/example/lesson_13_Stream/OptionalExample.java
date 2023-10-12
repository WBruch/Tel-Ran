package org.example.lesson_13_Stream;

import org.example.lesson_13_Stream.helper.StreamApiExamples;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.of("M");
        if (optionalName.isPresent()) {
            String name = optionalName.get();
            System.out.println(name);
        } else {
            System.out.println("nvnv");
        }


    }
}
