package org.task_8;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Task {
    private String title;
    private Date deadline;
    private Priority priority;
    private double reward;

    public Task(String title, Date deadline, Priority priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    public double calculatePayment() {
        return this.priority.getRewardRatio() * this.reward;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                ", reward=" + reward +
                '}';
    }
}
