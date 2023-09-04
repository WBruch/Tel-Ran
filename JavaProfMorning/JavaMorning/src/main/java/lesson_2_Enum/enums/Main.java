package lesson_2_Enum.enums;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("mike",Department.HR,AccessLevel.LOW );
        Employee e2 = new Employee("alex",Department.SALES,AccessLevel.MEDIUM );
        Employee e3 = new Employee("nick",Department.SECURITY,AccessLevel.HIGH );
        Employee e4 = new Employee("elena",Department.HR,AccessLevel.LOW );

        Employee[] employees = {e1, e2, e3, e4};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAccessLevel() == AccessLevel.HIGH) {
                System.out.println(employees[i].getName() + " go");
            }
        }


    }
}
