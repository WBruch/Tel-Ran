package pravtice_5;

public class Employee implements Comparable<Employee>{

    private String name;
    private String surName;
    private int id;
    private double salary;

    public Employee(String name, String surName, int id, double salary) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return (int)(this.getSalary() - o.getSalary());
    }
}
