package homeWork.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Employee[] employees = Genarator.empGen();
    List<Employee> employeeList = SetUp.setUP(employees);
    ServiceCollection service = new ServiceCollection();

        service.sortBySalary(employeeList);
        System.out.println(employeeList);
        System.out.println(service.getEmployeeInfo(employeeList));
        System.out.println(service.getAvgSalaryByDepartments(employeeList));
        System.out.println(service.getEmployeeInfoWhoFulfilledThePlan(employeeList));
      //  service.increaseBonusInDepartment(employeeList, 0.05);
       // service.reduceBonusInDepartment(employeeList, 0.05);
        service.getPromotionInSalesDepartment(employeeList,800,0.09);
        System.out.println(employeeList);
    }
}