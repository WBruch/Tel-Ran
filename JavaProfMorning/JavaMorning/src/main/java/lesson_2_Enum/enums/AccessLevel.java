package lesson_2_Enum.enums;

import lombok.AllArgsConstructor;

public enum AccessLevel {

    LOW,
    MEDIUM,
    HIGH
}

enum Department {
    HR,
    SECURITY,
    FINANCE,
    SALES
}
class Employee {
    public Employee(String name, Department department, AccessLevel accessLevel) {
        this.name = name;
        this.department = department;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    private String name;
    private Department department;
    private AccessLevel accessLevel;
}
