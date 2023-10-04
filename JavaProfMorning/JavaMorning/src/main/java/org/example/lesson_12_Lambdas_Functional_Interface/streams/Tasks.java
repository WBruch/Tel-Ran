package org.example.lesson_12_Lambdas_Functional_Interface.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Tasks {
    private int age;
    private String name;


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 29, 5, 60, 4, 98, 7, 2, 63, 4, 30, 96);
        List<String> stringList = Arrays.asList("a2a2r", "B4ruy5", "a6a22", "QQ220", "One", "a6a22", "QQ220");
        List<String> stringListInt = Arrays.asList("2", "45", "6", "20");
        List<Tasks> tasksList = Arrays.asList(new Tasks(52, "Anton"), new Tasks(42, "Eugen"), new Tasks(32, "Boris"));

// Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> list2 = list.stream()
                .filter(el -> el % 2 != 0)
                .toList();
        System.out.println();
        System.out.println(list2);

//Задание 2: Преобразование списка строк в список чисел
        List<Integer> list3 = stringListInt.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(list3 + "\n" + "**************************");

// //Задание 3: Суммирование списка чисел
        int list4 = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(list4 + "\n" + "**************************");

//Задание 4: Определение максимального значения в списке
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max + "\n" + "**************************");

//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> list5 = stringList.stream()
                .filter(str -> str.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(list5 + "\n" + "**************************");
//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> list6 = stringList.stream()
                .filter(el -> el.length() > 4)
                .distinct()
                .toList();
        System.out.println(list6 + "\n" + "**************************");

//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
        List<String> list7 = tasksList.stream()
                .sorted(Comparator.comparing(Tasks::getAge))
                .map(Tasks::getName)
                .toList();
        System.out.println(list7 + "\n" + "**************************");

//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        int sum8 = list.stream()
                .filter(el -> (el % 3 == 0 && el % 5 == 0))
                .reduce(0,Integer::sum);
        System.out.println(sum8 + "\n" + "**************************");

//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> list9 = stringList.stream()
                .distinct()
                .filter(el -> (el.chars().distinct().count() == el.length()))
                .toList();
        System.out.println(list9);

    }
}
