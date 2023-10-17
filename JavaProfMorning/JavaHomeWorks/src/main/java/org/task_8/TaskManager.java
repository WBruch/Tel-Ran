package org.task_8;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

@Getter
public class TaskManager<T extends Task> {
    private Map<Priority, List<T>> tasks = new HashMap<>();

    public void addTask(T newTask) {
        List<T> taskList = tasks.get(newTask.getPriority());
        if (taskList == null) {
            taskList = new ArrayList<>();
        }
        taskList.add(newTask);

        tasks.put(newTask.getPriority(), taskList);
    }

    public double calculateTotalPayment() {
        double sum = 0;
        for (Map.Entry<Priority, List<T>> current : tasks.entrySet()) {
            double currentSum = current.getValue().stream()
                    .flatMapToDouble(el -> DoubleStream.of(el.calculatePayment()))
                    .sum();
            sum += currentSum;
        }
        return sum;
    }
}
