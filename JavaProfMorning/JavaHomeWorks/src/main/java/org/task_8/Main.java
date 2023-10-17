package org.task_8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager<Task> tas = new TaskManager<>();
        Task task1 = new PriorityTask("task1", new Date(2885769L), Priority.HIGH, 100, Priority.URGENT);
        Task task2 = new PriorityTask("task2", new Date(28825769L), Priority.HIGH, 200, Priority.HIGH);
        Task task3 = new UrgentTask("URG Task1", 300);
        Task task4 = new UrgentTask("URG Task2", 400);
        Task task5 = new Task("task 5", new Date(47364534L), Priority.STANDARD, 500);

        tas.addTask(task1);
        tas.addTask(task2);
        tas.addTask(task3);
        tas.addTask(task4);
        tas.addTask(task5);

        System.out.println(tas.getTasks());
        System.out.println(tas.getTasks().size());

        System.out.println(tas.calculateTotalPayment());

        Task task6 = new PriorityTask("task6", new Date(28825769L), Priority.LOWEST, 200, Priority.HIGH);
        tas.addTask(task6);
        System.out.println(tas.calculateTotalPayment());
        System.out.println(task6.calculatePayment());
    }
}
