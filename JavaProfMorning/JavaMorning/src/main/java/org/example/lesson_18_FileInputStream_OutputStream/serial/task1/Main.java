package org.example.lesson_18_FileInputStream_OutputStream.serial.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A",18,3.3));
        list.add(new Student("B",18,4.1));
        list.add(new Student("C",18,4.5));
        SerialDeserial.saveStudentsToFile(list,"students.txt");
        System.out.println(SerialDeserial.loadStudentsFromFile("students.txt"));
        SerialDeserial.filterAndSaveStudentsByGrade(list,4,"graded.txt");
        System.out.println(SerialDeserial.loadStudentsFromFile("graded.txt"));
        System.out.println(SerialDeserial.calculateAverageGrade("graded.txt"));

    }
}
