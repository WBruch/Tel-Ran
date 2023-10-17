package org.task_8;

import lombok.Getter;

@Getter
public enum Priority {
    URGENT(2),
    HIGH(1.5),
    STANDARD(1),
    LOW(0.75),
    LOWEST(0.5);
    private final double rewardRatio;

    Priority(double rewardRatio) {
        this.rewardRatio = rewardRatio;
    }
}
