package org.tasks_3;

public enum Grade {
    A("Excellent"),
    B("Good"),
    C("Satisfactory"),
    D("Low Pass, but certifying"),
    F("Failure");

    Grade(String gradeValue) {
        this.gradeValue = gradeValue;
    }

    private final String gradeValue;


}
