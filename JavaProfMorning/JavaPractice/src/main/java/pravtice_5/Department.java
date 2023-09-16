package pravtice_5;

public class Department {

    private String name;
    Employee[] employees;

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
