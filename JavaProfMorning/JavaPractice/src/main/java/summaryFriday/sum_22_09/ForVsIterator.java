package summaryFriday.sum_22_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ForVsIterator {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
// O(n)
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
// O(n^2)
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
// O(n)
        for (String current : list2) {
            System.out.println(current);
        }
    }
}
