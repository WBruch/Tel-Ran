package org.example.lesson_17_Exeptions_and_IO;

public class ET {
    public double dev(int a, int b) {
        if (b == 0) {
            throw new ZeroExeption("**ZERO**");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(new ET().dev(a, b));
    }
}

class ZeroExeption extends RuntimeException {
    public ZeroExeption(String message) {
        super(message);
    }
}