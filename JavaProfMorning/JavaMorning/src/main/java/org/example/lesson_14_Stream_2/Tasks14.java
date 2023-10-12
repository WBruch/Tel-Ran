package org.example.lesson_14_Stream_2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks14 {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
        m7();
        m9(Arrays.asList(1, 12, 3, 54, 5, 46, 7, 8, 69), 2);
        m10(0,5);

    }

    /**
     * Дан список строк. Необходимо найти количество строк, которые содержат заданное подстроку.
     */
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        String subString = "ava";
        long count = list.stream()
                .filter(el -> el.contains(subString))
                .count();
        System.out.println(count);
    }

    /**
     * Дан список целых чисел. Необходимо найти максимальный
     * элемент списка, который делится на заданное число без остатка.
     */
    private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 66, 25, 30, 33);
        int del = 3;
        Integer i = list.stream()
                .filter(digit -> digit % del == 0)
                .max(Integer::compareTo)
                .get();
        System.out.println(i);
    }

    /**
     * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
     * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
     */
    private static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Igor", 25),
                new Person("Jack", 30),
                new Person("Egor", 35),
                new Person("Alla", 40)
        );
        char start = 'J';
        double avgAge = people.stream()
                .filter(person -> person.getName().startsWith(String.valueOf(start)))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.printf("Avg age is: %.2f\n", avgAge);
    }

    /**
     * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
     * этой коллекции строк, и вернуть их в виде списка.
     */
    private static void m4() {
        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language."
        );
        List<String> collect = lines.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

    }

    /**
     * подсчитать буквы в нижнем и верхнем регистре
     * String ss = "KikJhYggfTgf";
     */

    private static void m5() {
        String ss = "KikJhYggfTgf";
        Map<String, Long> letters = ss.chars()
                .mapToObj(current -> (char) current)
                .collect(Collectors.groupingBy(
                        chr -> Character.isLowerCase(chr) ? "lower" : "upper", Collectors.counting()
                ));
        System.out.println(letters);
    }


    /**
     * Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional
     * Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
     * Optional<Map.Entry<Integer, List<String>>> max =
     */
    private static void m6() {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        Optional<Map.Entry<Integer, List<String>>> max = stream
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toList()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey());
        System.out.println(max);
    }

    /**
     * Дан список сотрудников, у каждого из которых есть поле "salary".
     * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
     * в компаниях, которые находятся в городах, начинающихся на букву "M".
     */
    private static void m7() {
        List<Employee> employees = Arrays.asList(
                new Employee("developer", 3500, "Moscow"),
                new Employee("administrator", 2500, "Berlin"),
                new Employee("developer", 4200, "Melbourne"),
                new Employee("tester", 3300, "Moscow"),
                new Employee("developer", 4700, "Paris")
        );
        double avgSalary = employees.stream()
                .filter(employee -> employee.getJobTitle().equalsIgnoreCase("Developer") &&
                        employee.getCity().startsWith("M"))
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.printf("Average developer salary is %.2f%n", avgSalary);
    }
    /**
     * Задача 1.txt: Найти k-ую перестановку из n элементов
     * Дано число n и число k, необходимо найти k-ую перестановку из n элементов.
     */

    private static void m8(int n, int k) {
        System.out.println("!!!");
    }

    /**
     * Задача 2: Разбить список на подсписки заданного размера
     * Дан список элементов и размер подсписков. Необходимо разбить список
     * на подсписки указанного размера.
     */
    private static void m9(List<Integer> integerList, int sublistSize) {
        List<List<Integer>> resultList = IntStream
                .range(0, (integerList.size() + sublistSize - 1) / sublistSize)
                .mapToObj(el -> integerList.subList(el * sublistSize,
                        Math.min((el + 1) * sublistSize, integerList.size())))
                .collect(Collectors.toList());
        System.out.println(resultList);
    }

    /**
     * Для людей-индиго
     * Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.
     */
    private static void m10(int start, int end) {
        Predicate<Integer> isPrime = number -> {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        };

        Predicate<Integer> isPalindrome = number -> {
            String numberStr = String.valueOf(number);
            String reverseStr = new StringBuilder(numberStr).reverse().toString();
            return numberStr.equals(reverseStr);
        };

        int sum = IntStream.rangeClosed(start, end)
                .filter(isPrime::test)
                .filter(isPalindrome::test)
                .map(number -> number * number)
                .sum();
        System.out.println(sum);
    }
}


// *****************************************************************
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@AllArgsConstructor
@Getter
class Employee {
    private String jobTitle;
    private int salary;
    private String city;
}