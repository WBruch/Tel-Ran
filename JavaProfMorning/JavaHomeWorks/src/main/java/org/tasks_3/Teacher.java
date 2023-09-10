package org.tasks_3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс Teacher (наследник класса Person):
 * <p>
 * Создать класс Teacher, который будет представлять преподавателя.
 * Класс Teacher не реализует интерфейс Graded.
 * Класс Teacher должен содержать следующее поле:
 * teacherGrade (Grade) - оценка, которую выставляет преподаватель студентам.
 * Класс Teacher должен иметь метод gradeStudent(), который будет выставлять оценку студенту.
 * В данном ТЗ можно использовать случайное присвоение оценки студенту.
 * Класс Teacher должен переопределить метод getDescription() для вывода информации о преподавателе.
 */

@Getter
@Setter
public class Teacher extends Person {

    private Grade teacherGrade;

    private List<Student> studentGroup = new ArrayList<Student>(5);

    public Teacher(String name, int age) {
        super(name, age);

    }

    public void setStudentGroup(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public Grade gradeStudent() {
        Random random = new Random();
        int teacherGrade = random.nextInt(5);
        return Grade.values()[teacherGrade];
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    String getDescription() {
        return this.toString();
    }
}
