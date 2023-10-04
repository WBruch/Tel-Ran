package org.example.lesson_12_Lambdas_Functional_Interface;

import java.util.Arrays;
import java.util.List;

public class Str1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Q", "W", "S", "X");
        name.forEach(System.out::println);
        name.forEach(el -> System.out.println(el));
    }
}
