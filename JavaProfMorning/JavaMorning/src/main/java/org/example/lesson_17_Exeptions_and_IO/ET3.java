package org.example.lesson_17_Exeptions_and_IO;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ET3 {
    private static void s1() throws Exception{};
    private static void s2() throws IOException {};
    private static void s3() throws FileNotFoundException {};

    public static void main(String[] args) {
        try {
            s1();
            s2();
            s3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException r) {
            throw new RuntimeException(r);
        } catch (Exception t) {
            throw new RuntimeException(t);
        }
    }
}
