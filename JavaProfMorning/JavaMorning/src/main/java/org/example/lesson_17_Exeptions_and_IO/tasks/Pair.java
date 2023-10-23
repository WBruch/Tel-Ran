package org.example.lesson_17_Exeptions_and_IO.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static Pair<String, String> longestAndShortestNames(String fileName) {

        try (Stream<String> stringStream = Files.lines(Paths.get(fileName))) {
            List<String> list = stringStream
                    .collect(Collectors.groupingBy(String::length))
                    .entrySet().stream()
                    .sorted(Comparator.comparingInt(Map.Entry::getKey))
                    .flatMap(el -> el.getValue().stream())
                    .distinct()
                    .toList();

            return new Pair<>(list.get(0), list.get(list.size() - 1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}