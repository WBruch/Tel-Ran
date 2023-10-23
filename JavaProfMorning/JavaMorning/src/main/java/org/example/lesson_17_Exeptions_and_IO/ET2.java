package org.example.lesson_17_Exeptions_and_IO;

import java.io.FileNotFoundException;

public class ET2 {
    private static void m1() throws FileNotFoundException {
//        FileReader fileReader = new FileReader("1234.txt");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2");
        m1();
    }

    public static void main(String[] args) throws FileNotFoundException {
        m2();
    }
}
