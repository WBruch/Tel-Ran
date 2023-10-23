package org.example.lesson_17_Exeptions_and_IO.tasks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(countTotalNames("names.txt"));
        System.out.println(uniqueNames("names.txt"));
        System.out.println(countNamesContainingSubstring("names.txt", "a"));
        System.out.println(namesWithLengthInRange("names.txt", 4, 6));
        System.out.println(firstNNamesAlphabetically("names.txt", 5));
        System.out.println(topFiveCommonNames("names.txt"));
        System.out.println(namesStartingWithAndOccurMoreThanTwice("names.txt",'a'));
        System.out.println(Pair.longestAndShortestNames("names.txt"));
    }


    // **Подсчет общего числа имен в файле
    public static long countTotalNames(String fileName) {
        long count = 0L;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    //    **Нахождение уникальных имен в файле
    public static Set<String> uniqueNames(String fileName) {
        Set<String> unique = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                unique.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return unique;
    }

    //    **Подсчет числа имен, содержащих заданную подстроку
    public static long countNamesContainingSubstring(String fileName, String substring) {
        long count = 0L;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(substring.toLowerCase())) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    //    **Нахождение имен, длина которых находится в заданном диапазоне
    public static List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength) {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() < maxLength && line.length() > minLength) {
                    names.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    // **Вывод первых N имен в алфавитном порядке
    public static List<String> firstNNamesAlphabetically(String fileName, int n) {
        try (Stream<String> stringStream = Files.lines(Paths.get(fileName))) {
            return stringStream
                    .sorted()
                    .limit(n)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // **Нахождение пяти самых часто встречающихся имен в файле
    public static List<String> topFiveCommonNames(String fileName) {
        try (Stream<String> stringStream = Files.lines(Paths.get(fileName))) {
            return stringStream.collect(Collectors.groupingBy(el -> el, Collectors.counting()))
                    .entrySet().stream()
                    .sorted((o1,o2) -> Math.toIntExact(o2.getValue() - o1.getValue()))
                    .map(Map.Entry::getKey)
                    .limit(5)
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // **Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
    public static Set<String> namesStartingWithAndOccurMoreThanTwice(String fileName, char c) {
        try (Stream<String> stringStream = Files.lines(Paths.get(fileName))) {
            return stringStream
                    .filter(string -> string.toLowerCase().startsWith(String.valueOf(c).toLowerCase()))
                    .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                    .entrySet().stream()
                    .filter(el -> el.getValue() > 2)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}