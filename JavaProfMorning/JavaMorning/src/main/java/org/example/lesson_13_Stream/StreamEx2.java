package org.example.lesson_13_Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);

// limit()
list.stream()
        .limit(3)
        .toList();

// skip()
list.stream()
        .skip(2)
        .toList();

// foreach
        list.stream().forEachOrdered(System.out::println);

// anyMatch, allMatch, noneMatch
boolean b = list.stream()
        .anyMatch(el -> el < 8);

// findFirst
        Optional<Integer> first = list.stream()
                .filter(el -> el < 0)
                .findFirst();
        System.out.println(first);

// collect()
list.stream();
//        .collect();

// flatMap()
        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1,4,23),
                Arrays.asList(41,6,273),
                Arrays.asList(42,43,20),
                Arrays.asList(8,8,27));

        List<Integer> integers = listList.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(integers);

    }
}
