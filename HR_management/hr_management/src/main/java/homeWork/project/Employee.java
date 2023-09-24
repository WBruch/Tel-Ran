package homeWork.project;

import lombok.Data;

@Data
public class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private String surname;
    private Grade grade;
    private Department department;
    private double salary;
    private double bonusPCT;
    private boolean hasPlanBeenCompleted;

    public Employee() {
        this.id = "id";
        this.name = "name";
        this.surname = "surname";
        this.grade = Grade.D;
        this.department = Department.HR;
        this.salary = 0;
        this.bonusPCT = 0;
        this.hasPlanBeenCompleted = false;
    }

    @Override
    public int compareTo(Employee o) {
        return (int)(this.getSalary() - o.getSalary());
    }
}
