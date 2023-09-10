package org.tasks_3;

/**
 * Создать класс Student, который будет представлять студента.
 * Класс должен реализовать интерфейс Graded.
 * Класс Student должен содержать следующее поле:
 * grade (Grade) - оценка студента.
 * Класс Student должен переопределить метод getDescription(), чтобы возвращать информацию о студенте.
 */
public class Student extends Person implements Graded, Cloneable{

    private Grade grade;

    public Student(String name, int age) {
        super(name, age);

    }

    @Override
    public Grade getGrade() {
        return this.grade;
    }

    @Override
    String getDescription() {
        return this.toString();
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student) super.clone();
        return cloneStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
