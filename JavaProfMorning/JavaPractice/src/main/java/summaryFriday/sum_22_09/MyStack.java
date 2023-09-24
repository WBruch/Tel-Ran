package summaryFriday.sum_22_09;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> list = new LinkedList<>();
    public void push(String data) {
        list.addFirst(data);
    }

    public String pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
