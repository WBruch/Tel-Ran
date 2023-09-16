package summaryFriday.sum_15_09;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
//
//        List objectList = new ArrayList<>();
//        objectList.add(11);
//        objectList.add("ABC");
//        objectList.add(2.44);
//
//
//
        names.add("Andrew");
        names.add("Antony");
        names.add("Bob");
        names.add("John");
        names.add("Bruce");
        names.add("Jack");

        System.out.println(names.get(0));
        System.out.println(names.get(3));
        System.out.println(names.get(2));

        System.out.println(names.contains("Mary"));
        System.out.println(names.size());
        System.out.println(names.indexOf("Bob"));


        for (String s : names) {
            System.out.print(s + " ");
        }



    }
}
