package pravtice_5;

public class Processor {
    public double getAvgSalaryByDepartment(Department department) {
        int salary = 0;
        for (int i = 0; i < department.employees.length; i++) {
            salary += department.employees[i].getSalary();
        }
        return (double) salary / department.employees.length;
    }

    public Department getMaxAvgSalaryByDepartment(Company company) {
        int maxSalary = 0;
        Department depo = new Department("1", new Employee[1]);
        for (int i = 0; i < company.getDepartments().length; i++) {
            if (getAvgSalaryByDepartment(company.getDepartments()[i]) > maxSalary) {
                depo = company.getDepartments()[i];
            }
        }

        return depo;
    }

    public Employee[] getEmployeeWithSimilarSurname(Company company) {


        return null;
    }
}
