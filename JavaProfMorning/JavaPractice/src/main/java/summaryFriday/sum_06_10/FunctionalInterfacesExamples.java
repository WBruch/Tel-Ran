package summaryFriday.sum_06_10;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterfacesExamples {
    public static void main(String[] args) {


        // void -> data ---- Supplier
        Supplier<Integer> randomGenerator = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        Supplier<Integer> positiveIntsGenerator = () -> {
            Random random = new Random();
            return random.nextInt(0, 100);
        };

        System.out.println(randomGenerator.get());
        System.out.println(randomGenerator.get());
        System.out.println(randomGenerator.get());
        System.out.println(positiveIntsGenerator.get());
        System.out.println(positiveIntsGenerator.get());
        System.out.println(positiveIntsGenerator.get());
        System.out.println("**************** Consumer ***************");

        // data -> void ---- Consumer ---- accept
        Consumer<String> printData = (s) -> System.out.println(s);
        printData.accept("Data 1");
        printData.accept("Data 2");
        printData.accept("Data 3");
        System.out.println("**************** Function ***************");

        // data1 -> data2 ---- Function / UnaryOperator (one type of input-output) ---- apply
        Function<Double, Double> multiplyTo100 = (x) -> x * 100;
        System.out.println(multiplyTo100.apply(10.0));
        System.out.println("**************** Predicate ***************");


        // data -> boolean -- Predicate -- test()
        Predicate<String> isLongEnough = (s) -> s.length() > 5;
        System.out.println(isLongEnough.test("Hello!"));
        System.out.println(isLongEnough.test("Hi!"));
        System.out.println("**************** BiFunction ***************");


        // (data1, data2) -> data3 ---- BiFunction / BinaryOperator (one type of input-output)
        BiFunction<Double, Double, Double> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(10.0, 88.0));


        Function<String, String> processString = (s) -> s.substring(6, 11);
        Function<String, String> processString2 = processString.compose((s) -> s.toUpperCase());
        Function<String, String> processString3 = processString2.andThen((p) -> "****" + p + "------");

        String result = processString3.apply("Hello world");
        System.out.println(result);

// Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
        BiFunction<Integer, Integer, Integer> pow = (x, y) -> (int)Math.pow(x, y);
        BiFunction<Double, Double, Double> pow2 = Math::pow;


    }
}
