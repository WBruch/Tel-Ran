package homeWork.project;

import java.security.KeyStore;
import java.util.*;

public class ServiceCollection {

    //***** helper method ******
    public List<Map.Entry<Department, Integer>> getListOfDepartmentsByEfficiency(List<Employee> employeeList) {
        Department[] departments = Department.values();

        Map<Department, Integer> temp = new HashMap<>();
        for (Department current :
                departments) {
            int numberOfEmployees = 0;
            for (Employee employee :
                    employeeList) {
                if (employee.isHasPlanBeenCompleted() && employee.getDepartment().equals(current)) {
                    numberOfEmployees++;
                }
            }
            temp.put(current, numberOfEmployees);
        }
        List<Map.Entry<Department, Integer>> list = new ArrayList<>(temp.entrySet());
        list.sort(Map.Entry.comparingByValue());
        return list;
    }

// ************************************************************************


    // - показать всех отсортировав по имени
    public void sortByName(List<Employee> list) {
        list.sort(new EmployeeNameComparator());
    }

    // - показать всех отсортировав по зарплате
    public void sortBySalary(List<Employee> list) {
        list.sort(Employee::compareTo);
    }

    //  - показать имя, фамилию, департамент и грейд
    public String getEmployeeInfo(List<Employee> employeeList) {
        String info = "";
        for (Employee current :
                employeeList) {
            info = String.format(info + "fullname : %1$s %2$s , salary:  %3$.2f%n",
                    current.getName(), current.getSurname(), current.getSalary());
        }

        return info;
    }
    // - показать среднюю зарплату по департаментам

    public String getAvgSalaryByDepartments(List<Employee> employeeList) {
        Department[] departments = Department.values();
        String info = "";
        for (Department current :
                departments) {
            double sum = 0;
            int counter = 0;
            for (Employee employee : employeeList) {
                if (employee.getDepartment().equals(current)) {
                    sum += employee.getSalary();
                    counter++;
                }
            }
            sum /= counter;
            info = String.format(info + "Average salary in the department %s is %.2f%n", current.toString(), sum);
        }

        return info;
    }

    //  - показать имя, фамилию и грейд только у тех кто выполнил план. hasPlanBeenCompleted = тру
    public String getEmployeeInfoWhoFulfilledThePlan(List<Employee> employeeList) {
        String info = "Employees who fulfilled the plan: %n";
        for (Employee current :
                employeeList) {
            if (current.isHasPlanBeenCompleted()) {
                info = String.format(info + "%s %s grade \"%s\"%n",
                        current.getName(), current.getSurname(), current.getGrade());
            }
        }
        return info;
    }

    //  - повысить % бонуса у всех сотрудников того департамента, в котором больше всего сотрудников hasPlanBeenCompleted = тру,
    //  если таких несколько то повысить у всех.
    public void increaseBonusInDepartment(List<Employee> employeeList, double increaseBonus) {

        List<Map.Entry<Department, Integer>> list = getListOfDepartmentsByEfficiency(employeeList);
        Department[] departments = Department.values();
        System.out.println(list);
        for (Map.Entry<Department, Integer> depo :
                list) {
            if ((int) depo.getValue() == (int) list.get(list.size() - 1).getValue())

                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getDepartment().equals(depo.getKey())) {
                        employeeList.get(i).setBonusPCT(employeeList.get(i).getBonusPCT() + increaseBonus);
                    }
                }
        }
    }

    //  - понизить % бонуса у департамента у которого меньше всего сотрудников выполнило план, если таких несколько то у всех
    public void reduceBonusInDepartment(List<Employee> employeeList, double reduceBonus) {

        List<Map.Entry<Department, Integer>> list = getListOfDepartmentsByEfficiency(employeeList);
        Department[] departments = Department.values();

        for (Map.Entry<Department, Integer> depo :
                list) {
            if ((int) depo.getValue() == (int) list.get(0).getValue())

                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getDepartment().equals(depo.getKey())) {
                        if (employeeList.get(i).getBonusPCT() >= reduceBonus) {
                            employeeList.get(i).setBonusPCT(employeeList.get(i).getBonusPCT() - reduceBonus);
                        } else employeeList.get(i).setBonusPCT(0);
                    }
                }
        }
    }

    // - у департамента продаж взять всех кто выполнили план и если у сотруднка который выполнил план грейд А то повысить зп и бонус,
    // если грейд ниже то повысить на 1 ступень и только зп.
    public void getPromotionInSalesDepartment(List<Employee> employeeList, double increaseSalary, double increaseBonus) {
        Grade[] grades = Grade.values();
        for (Employee employee:
             employeeList) {
            if (employee.getDepartment().equals(Department.SALES) && employee.isHasPlanBeenCompleted()) {
                if (employee.getGrade().equals(Grade.A)) {
                    employee.setSalary(employee.getSalary() + increaseSalary);
                    employee.setBonusPCT(employee.getBonusPCT() + increaseBonus);
                } else {
                    employee.setGrade(grades[employee.getGrade().ordinal() - 1]);
                    employee.setSalary(employee.getSalary() + increaseSalary);
                }
            }
        }
    }


}
