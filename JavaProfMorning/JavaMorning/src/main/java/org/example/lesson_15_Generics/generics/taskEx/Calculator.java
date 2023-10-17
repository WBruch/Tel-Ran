package org.example.lesson_15_Generics.generics.taskEx;

public class Calculator<T extends Number> {
    private T value;

    public Calculator(T value) {
        this.value = value;
    }
    public double add(Calculator<? extends Number> other) {
        return this.value.doubleValue() + other.value.doubleValue();
    }


}
