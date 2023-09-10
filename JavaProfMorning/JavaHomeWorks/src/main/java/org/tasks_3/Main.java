package org.tasks_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GradeManagementSystem manager = new GradeManagementSystem();

        manager.initStudentGroup(); // инициализируем группы студентов и преподавателей
        manager.initTeacherGroup();

        manager.gradeStudents(manager.students, manager.teachers); // каждый препод выставляет оценку по своему предмету каждому студенту


        manager.processTeachers(manager.teachers); // выводим список преподавателей с оценками студентов для каждого учителя

    }
}
