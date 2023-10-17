package org.task_8;

import java.util.Date;

public class UrgentTask extends Task{

    public UrgentTask(String title,double reward) {
        super(title, new Date(), Priority.URGENT, reward);
    }
}
