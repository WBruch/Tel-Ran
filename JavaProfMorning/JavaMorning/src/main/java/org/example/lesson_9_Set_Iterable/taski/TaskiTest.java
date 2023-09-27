package org.example.lesson_9_Set_Iterable.taski;

import java.util.*;

public class TaskiTest {
    static void getPersonContainsSubstring(Set<Person> set, String sub) {
        for (Person current :
                set) {
            if (current.getLocation().contains(sub)) System.out.println(current);
        }
    }

    static Set<Person> getOddPerson(Set<Person> set) {
        Iterator<Person> itr = set.iterator();
        while (itr.hasNext()) {
            if (itr.next().getAge() % 2 == 0)
                itr.remove();
        }
        return set;
    }

    static Set<Person> getCommonElements(Set<Person> set, Set<Person> set2) {
        Set<Person> result = new HashSet<>();
        for (Person current :
                set) {
            if (set2.contains(current))
                result.add(current);
        }
        return result;
    }

    public static void main(String[] args) {
// - Создать 10 объектов класса
//- Поместить все с Хэш СЕт и вывести на экран
        Person[] persons = PersonGenerator.persons();
        HashSet<Person> personHashSet = new HashSet<>();

        Collections.addAll(personHashSet, persons);

        System.out.println(personHashSet);

        HashSet<Person> person2HashSet = new HashSet<>();
        person2HashSet.add(new Person("Mike", 24, "koln neu", false));
        person2HashSet.add(new Person("Michael", 25, "Kirchen", false));
        person2HashSet.add(new Person("Norman", 26, "koln", true));
        person2HashSet.add(new Person("John", 23, "Asbach", false));
        person2HashSet.add(new Person("Jack", 28, "Asbach", false));
        person2HashSet.add(new Person("Erich", 27, "koln neu", false));


// - Создайте TreeSet и найдите наименьший и наибольший элементы (int) в нем, перебирая элементы внутри набора.
        TreeSet<Person> personTreeSet = new TreeSet<>(personHashSet);
        System.out.println("Min: " + personTreeSet.first() + "Max: " + personTreeSet.last());

//  - Напишите метод, который принимает Set и находит все объекты, содержащие определенную подстроку(из поля стринг),
//  перебирая элементы и используя метод contains.

        getPersonContainsSubstring(person2HashSet, "koln");

// - Напишите метод, которая удаляет все четные инт из HashSet и выводит оставшиеся элементы. Используйте итератор.

        System.out.println(getOddPerson(person2HashSet));

//  - Создайте метод, который принимает два HashSet<Наш Класс> и возвращает новый HashSet,
//  содержащий элементы, которые присутствуют в обоих множествах
        HashSet<Person> person3HashSet = new HashSet<>();
        person3HashSet.add(new Person("Erich", 27, "koln neu", false));
        person3HashSet.add(new Person("Michael", 25, "Kirchen", false));
        person3HashSet.add(new Person("Jack", 26, "koln", true));
        person3HashSet.add(new Person("John", 24, "Asbach", false));
        System.out.println("********");
        System.out.println(getCommonElements(person2HashSet, person3HashSet));
    }
}
