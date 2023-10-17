package org.example.lesson_15_Generics.generics;

public class GE2 {
    public static void main(String[] args) {

        Information<String> information = new Information<>("QWERTY");
        System.out.println(information);

        String str = information.getValue();
        System.out.println(str);

        Information<Integer> integerInformation = new Information<>(777);
        System.out.println(integerInformation);



    }
}

class Information<T> {
    private T value;

    public Information(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Information{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}