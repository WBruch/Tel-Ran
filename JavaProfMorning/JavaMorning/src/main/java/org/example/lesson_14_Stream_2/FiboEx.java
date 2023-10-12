package org.example.lesson_14_Stream_2;

import java.util.stream.Stream;

public class FiboEx {
    // 0 1 1 2 3 5 8 13 21 34 55 89 ...
    public static long fibLOOP(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        var fib1 = -1L;
        var fib2 = 1;
        for (int i = 0; i <= index; i++) {
            var fibCurrent = fib1 + fib2;
            fib1 = fib2;
            fib2 = (int) fibCurrent;
        }
        return fib2;
    }


    public static long fibREQ(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            return 0;
        }
        return index == 1 || index == 2 ? 1L : fibREQ(index - 2) + fibREQ(index - 1);
    }


    public static long fibSTREAM(final int index) {
        var result =
        Stream.iterate(new long[]{0,1}, arr -> new long[]{arr[1],arr[0]+arr[1]})
                .limit(index+1)
                .map(y -> y[0])
                .max(Long::compareTo);
        return result.orElseThrow(IllegalArgumentException::new);


    }

    public static void main(String[] args) throws IllegalAccessException {
        int n = 50;

        long fibLoop = System.currentTimeMillis();
        fibLOOP(n);
        System.out.println("LOOP: " + (System.currentTimeMillis() - fibLoop));

        long fibRec = System.currentTimeMillis();
        fibREQ(n);
        System.out.println("REC: " + (System.currentTimeMillis() - fibRec));

        long fibSTREAM = System.currentTimeMillis();
        fibSTREAM(n);
        System.out.println("STREAM: " + (System.currentTimeMillis() - fibSTREAM));
    }
}
