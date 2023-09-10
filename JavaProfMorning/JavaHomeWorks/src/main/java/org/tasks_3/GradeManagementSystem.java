package org.tasks_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс GradeManagementSystem:
 * <p>
 * Создать класс GradeManagementSystem, который будет управлять системой оценок в университете.
 * Класс GradeManagementSystem должен содержать следующие поля:
 * Массив объектов students (Student[]) - массив студентов.
 * Массив объектов teachers (Teacher[]) - массив преподавателей.
 * Класс GradeManagementSystem должен иметь методы:
 * processStudents() - метод для вывода информации о студентах (перебор массива студентов).
 * processTeachers() - метод для вывода информации о преподавателях (перебор массива преподавателей).
 * gradeStudents() - метод для автоматической выставления оценок студентам
 * преподавателями (используя метод gradeStudent() из класса Teacher).
 */
public class GradeManagementSystem {

    List<Student> students;
    List<Teacher> teachers;

    public void processStudents() {
        for (Student currentStudent :
                students) {
            System.out.println(currentStudent.toString());
        }
    }

    public void processTeachers(List<Teacher> teachers) {
        for (Teacher currentTeacher :
                teachers) {
            System.out.println(currentTeacher.toString() + " " + currentTeacher.getStudentGroup().toString());
        }
    }


    public void gradeStudents(List<Student> students, List<Teacher> teachers) throws CloneNotSupportedException {
        for (int i = 0; i < teachers.size(); i++) {                          // каждый учитель оценивает студента по своей дисциплине
            for (int j = 0; j < students.size(); j++) {
                Student student = (Student) students.get(j).clone(); // клонируем каждого студента, т.к. при изменении поля Grade
                // оно меняется у всех преподавателей, а нам нужно чтобы у студента по разным предметам(преподавателей) были разные оценки
                student.setGrade(teachers.get(i).gradeStudent()); // учитель оценивает студента
                teachers.get(i).getStudentGroup().add(student);     // добавляет студента в журнал оценок по своему предмету
            }

        }
    }

    /**
     * Создаем и заполняем список группы студентов
     */
    public void initStudentGroup() {
        System.out.print("Введите количество студентов в группе: ");
        Scanner console = new Scanner(System.in);
        int numberOfStudents = console.nextInt();
        students = new ArrayList<Student>(numberOfStudents);
        int counter = 0;
        while (numberOfStudents != counter) {
            console.nextLine(); // заглушка, без нее не работает, хз почему))
            System.out.print("Введите имя студента: ");
            String name = console.nextLine();
            System.out.print("Введите возраст студента: ");
            int age = console.nextInt();
            Student st = new Student(name, age);
            students.add(st);
            counter++;
        }
        System.out.printf("В группе учатся %d студентов %n", numberOfStudents);
    }

    /**
     * Создаем и заполняем список преподавателей на потоке
     */

    public void initTeacherGroup() {
        System.out.print("Введите количество преподавателей на потоке: ");
        Scanner console = new Scanner(System.in);
        int numberOfTeachers = console.nextInt();
        teachers = new ArrayList<Teacher>(numberOfTeachers);
        int counter = 0;
        while (numberOfTeachers != counter) {
            console.nextLine(); // заглушка
            System.out.print("Введите имя преподавателя: ");
            String name = console.nextLine();
            System.out.print("Введите возраст преподавателя: ");
            int age = console.nextInt();
            Teacher teacher = new Teacher(name, age);
            teachers.add(teacher);
            counter++;
        }
        System.out.printf("На потоке преподают %d учителей %n", numberOfTeachers);
        console.close();
    }

}
