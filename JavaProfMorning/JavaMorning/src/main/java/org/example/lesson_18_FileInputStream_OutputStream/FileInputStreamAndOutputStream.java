package org.example.lesson_18_FileInputStream_OutputStream;

import java.io.*;

public class FileInputStreamAndOutputStream {
    public static void main(String[] args) {
//        try(BufferedReader reader = new BufferedReader(new FileReader("img.png"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("img_1.png"))) {
//
//            int i;
//            while ((i = reader.read()) != -1) {
//                writer.write(i);
//            }
//            System.out.println("***DONE**");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (FileInputStream inputStream = new FileInputStream("img.png");
             FileOutputStream outputStream = new FileOutputStream("newImg.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("***DONE**");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
