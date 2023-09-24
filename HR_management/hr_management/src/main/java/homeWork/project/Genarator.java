package homeWork.project;

import com.github.javafaker.Faker;

public class Genarator {
    private static Faker faker = new Faker();
    public static String empIdGen() {
        return faker.numerify("EMP%########");
    }

    public static Employee[] empGen() {
        Grade[] grades = Grade.values();
        Department[] departments = Department.values();

        Employee[] employees = new Employee[40];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].setId(Genarator.empIdGen());
            employees[i].setName(Genarator.faker.name().firstName());
            employees[i].setSurname(Genarator.faker.name().lastName());
            employees[i].setGrade(grades[Genarator.faker.random().nextInt(grades.length)]);
            employees[i].setSalary(Genarator.faker.random().nextInt(1500,7000));
            employees[i].setBonusPCT((double)Genarator.faker.random().nextInt(0,10) / 100);
            employees[i].setHasPlanBeenCompleted(Genarator.faker.random().nextBoolean());
            employees[i].setDepartment(departments[Genarator.faker.random().nextInt(departments.length)]);
        }
        return employees;
    }
}
