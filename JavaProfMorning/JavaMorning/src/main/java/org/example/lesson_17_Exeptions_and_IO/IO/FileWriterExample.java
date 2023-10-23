package org.example.lesson_17_Exeptions_and_IO.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "*** Hello world) ";
        try(FileWriter writer = new FileWriter("write.txt", true)) {
            for (int i = 0; i < text.length(); i++) {
               writer.write(text.charAt(i));
            }
            System.out.println("***DONE***");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
