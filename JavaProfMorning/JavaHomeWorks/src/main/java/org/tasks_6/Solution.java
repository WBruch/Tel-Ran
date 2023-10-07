package org.tasks_6;

import org.o4ko.Person;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(12, 2, 33, 4, 55, 6, 71, 8, 19, 100);
        List<String> strings = Arrays.asList("Arbitrary", "One", "Two", "Arrow", "One", "Two", "Arrow", "One", "Two", "Three", "Four");
        List<User> users = new ArrayList<>();
        users.add(new User("John", 19));
        users.add(new User("Michael", 33));
        users.add(new User("Jack", 25));
        users.add(new User("Max", 15));
        users.add(new User("Olaf", 18));
        users.add(new User("Nick", 12));


// Задача 1: Фильтрация четных чисел и умножение на 2.
        Optional<Integer> sum = integers.stream()
                .filter(el -> el % 2 == 0)
                .reduce(Integer::sum);

// Задача 2: Удаление дубликатов из списка строк.
        List<String> stringsResult = strings.stream()
                .distinct()
                .toList();

// Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        List<Integer> integersReverse = integers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

// Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        List<String> stringsUpperCase = strings.stream()
                .filter(el -> el.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

// Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        List<String> stringsWithoutFirstEl = strings.stream()
                .skip(2)
                .toList();

// Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        integers.stream()
                .filter(el -> el > 50)
                .forEach(el -> System.out.println(el * el));

// Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        LinkedList<String> stack = new LinkedList<>();
        strings.stream()
                .filter(el -> el.toLowerCase().contains("o"))
                .map(el -> new StringBuilder(el).reverse().toString())
                .forEach(stack::push);
        stack.stream().forEach(System.out::println);

// Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        List<Integer> integersOdd = integers.stream()
                .filter(el -> el % 2 != 0)
                .sorted()
                .toList();

// Задача 9: Получить среднее значение чисел в списке.
        Double avgValue = integers.stream()
                .mapToDouble(el -> el)
                .average()
                .getAsDouble();

// Задача 10: Получить строку, объединяющую элементы списка через запятую.
        String sumStringWithComma = strings.stream()
                .collect(Collectors.joining(","));

// Задача 11: Получить список квадратов чисел из другого списка.
        List<Integer> squareOfIntegers = integers.stream()
                .map(el -> el * el)
                .toList();

// Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
        strings.stream()
                .flatMap(el -> el.toLowerCase().chars().mapToObj(c -> (char) c))
                .sorted()
                .forEach(System.out::println);

// Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
        strings.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

// Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
        strings.stream()
                .skip(2)
                .distinct();

// Задача 15: Фильтрация и сортировка пользователей по возрасту.
        users.stream()
                .filter(u -> u.getAge() > 18)
                .sorted(Comparator.comparingInt(User::getAge))
                .forEach(System.out::println);
    }

}
