package summaryFriday.sum_13_10;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Arrays.asList(1,2,8,7,64,5,8,27,3).stream();

        IntStream primitiveInt = IntStream.rangeClosed(1,100)
                .filter(value -> value % 3 == 0 );
        int[] array = primitiveInt.toArray();
//            int sum = primitiveInt.sum();
//        System.out.println(Arrays.toString(array));

        Stream<Integer> boxedInts = IntStream.rangeClosed(1, 10).boxed();

        Stream<String> stringStream = IntStream.rangeClosed(1, 10).mapToObj(value -> String.valueOf(value));

        IntStream intStream = boxedInts.mapToInt(value -> value);


        int[] array1 = IntStream.rangeClosed(1, 1_000_000)
                .filter(value -> value % 5 == 0)
                .peek(System.out::println)
                .skip(10)
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(array1));
    }
}
