package org.example.lesson_18_FileInputStream_OutputStream.serial.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class SerialDeserial {
    private List<Student> students = new ArrayList<>();

    // Реализуйте метод saveStudentsToFile(List<Student> students, String filename),
    // который будет сохранять список студентов в файл.
    public static void saveStudentsToFile(List<Student> students, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(students);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("***DONE***");
    }

    //Реализуйте метод , который будет читать студентов из файла.
    public static List<Student> loadStudentsFromFile(String filename) {
        List<Student> list;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) {
            list = (List<Student>) input.readObject();
            System.out.println("***DONE***");
            return list;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

// *****Задание 2. Фильтрация студентов по оценке
//Описание: Добавьте функционал, который позволит фильтровать студентов с оценкой выше определенного значения и
//сохранять их в отдельный файл.
//Требования:
//Реализуйте метод filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename),
//который будет сохранять студентов с оценкой выше gradeThreshold в файл.

    public static void filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(students.stream().filter(student -> student.getGrade() > gradeThreshold).toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

// *****Задание 3. Средний балл студентов
//Описание: Напишите метод, который вычисляет средний балл всех студентов из файла.
//Требования:
//Реализуйте метод double calculateAverageGrade(String filename), который возвращает средний балл студентов.
    public static double calculateAverageGrade(String filename) {
        List<Student> list;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) {
            list = (List<Student>) input.readObject();
            return list.stream()
                    .flatMapToDouble(student -> DoubleStream.of(student.getGrade()))
                    .average()
                    .getAsDouble();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

