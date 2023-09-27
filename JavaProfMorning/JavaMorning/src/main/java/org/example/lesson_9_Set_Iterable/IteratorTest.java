package org.example.lesson_9_Set_Iterable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
    private static boolean isPalindrome(String word) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        int counter = 0;
        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> back = list.listIterator(list.size());
        while (forward.hasNext() && back.hasPrevious()) {
            char start = forward.next();
            char end = back.previous();
            if (start != end) {
                return false;
            } else if (counter > word.length() / 2) {
                return true;
            }
            counter++;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "MADAM";
        String notPalindrome = "YESTERDAY";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(notPalindrome));
    }
}
