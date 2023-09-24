package summaryFriday.sum_22_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Anna");
        names.add("John");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
            if (current.equals("Anna")) {
                iterator.remove();
            }
        }

        System.out.println("After remove operation: ");

        iterator = names.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }

///////////////////////////////////////////////////////////

        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        integers.add(400);
        integers.add(500);

        ListIterator<Integer> listIterator = integers.listIterator();
        while (listIterator.hasNext()) {
            Integer nextElement = listIterator.next();
            if (nextElement == 300) {
                listIterator.previous();
                listIterator.previous();
                listIterator.set(3000);
                break;
            }
        }

        for (Integer current :
                integers) {
            System.out.println(current);
        }
    }
}
