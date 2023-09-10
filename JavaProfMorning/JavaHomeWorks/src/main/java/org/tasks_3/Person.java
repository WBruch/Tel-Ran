package org.tasks_3;

/**
 * Класс Person (Абстрактный класс):
 *
 * Создать абстрактный класс Person, который будет служить базовым классом для студентов и преподавателей.
 * Класс должен содержать следующие поля:
 * name (строка) - имя персоны.
 * age (целое число) - возраст персоны.
 * Класс Person должен иметь абстрактный метод getDescription(), который будет переопределен в подклассах.
 */
abstract class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String getDescription();
}
