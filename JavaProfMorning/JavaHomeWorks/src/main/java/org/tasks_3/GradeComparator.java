package org.tasks_3;

import java.util.Comparator;

/**
 * - Класс GradeComparator (реализующий интерфейс Comparator):
 *
 * Создать класс GradeComparator, который будет реализовывать интерфейс Comparator<Student>
 * для сравнения студентов по их оценкам.
 * Класс должен содержать метод compare(), который сравнивает оценки двух студентов и возвращает результат сравнения.
 */
public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade().ordinal() - o2.getGrade().ordinal();
    }
}
