package homeWork.project;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().equals(o2.getName())) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
