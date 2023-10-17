package org.task_8;



import java.util.Date;
public class PriorityTask extends Task {
    private Priority requiredPriority;

    public PriorityTask(String title, Date deadline, Priority priority, double reward, Priority requiredPriority) {
        super(title, deadline, priority, reward);
        this.requiredPriority = requiredPriority;
    }

    public Priority getRequiredPriority() {
        return requiredPriority;
    }

    @Override
    public double calculatePayment() {
        if (super.getPriority().equals(this.getRequiredPriority())) {
            return super.calculatePayment();
        } else return 0;
    }
}
