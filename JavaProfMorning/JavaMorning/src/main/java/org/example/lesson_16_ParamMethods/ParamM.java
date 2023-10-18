package org.example.lesson_16_ParamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParamM {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<? extends Number> list1 = new ArrayList<>();

    }
}

class Gen {

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0.0d;
        for (Number n :
                list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void add(List<Object> list, Object o){
        list.add(o);
    }
}