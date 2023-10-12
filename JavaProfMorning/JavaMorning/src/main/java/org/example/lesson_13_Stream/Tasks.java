package org.example.lesson_13_Stream;

import org.example.lesson_9_Set_Iterable.taski.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");

// //Задание 1: Фильтрация списка целых чисел на нечетные числа
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,15);

        List<Integer> integers = numbers.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println(integers);

//Задание 2: Преобразование списка строк в список чисел
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integers1 = strings.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(integers1);

//Задание 3: Суммирование списка чисел
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int i = number.stream()
                .reduce(0, Integer::sum)
                .intValue();
        System.out.println(i);

//Задание 4: Определение максимального значения в списке
        Integer i1 = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(i1);

// Задание 5: Фильтрация списка строк на те, которые начинаются с
// определенной буквы и преобразование их в верхний регистре
        List<String> a = words.stream()
                .filter(str -> str.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(a);

//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> list = words.stream()
                .filter(str -> str.length() > 4)
                .distinct()
                .toList();
        System.out.println(list);

//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
        List<Person1> people = Arrays.asList(
                new Person1("John", 25),
                new Person1("Alice", 22),
                new Person1("Bob", 30));
        List<String> list1 = people.stream()
                .sorted(Comparator.comparing(Person1::getAge))
                .map(Person1::getName)
                .toList();
        System.out.println(list1);

//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        Integer reduce = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println(reduce);

//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> list2 = words.stream()
                .distinct()
                .filter(el -> (el.chars().distinct().count() == el.length()))
                .toList();
        System.out.println(list2);
    }
}
class Person1{
        private String name;
        private int age;

        public Person1(String name, int age) {
                this.name = name;
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }
}