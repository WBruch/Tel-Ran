package summaryFriday.sum_06_10;

import java.util.function.Consumer;

public class MethodReferencesExample {
    public static void main(String[] args) {
     //   Consumer<String> consumer = (s) -> doSomething(s);
        Consumer<String> consumer = MethodReferencesExample::doSomething;

        MethodReferencesExample example = new MethodReferencesExample();
        Consumer<String> consumer2 = example::doSomethingNonstatic;

        consumer.accept("!!!");
        consumer2.accept("!!!");
    }

    static void doSomething(String s) {
        System.out.println("doing something with " + s);
    }

    void doSomethingNonstatic(String s) {
        System.out.println("doing something nonstatic with " + s);
    }

    void someMethod(String s) {
        Consumer<String> consumer = this::doSomethingNonstatic;
    }
}
