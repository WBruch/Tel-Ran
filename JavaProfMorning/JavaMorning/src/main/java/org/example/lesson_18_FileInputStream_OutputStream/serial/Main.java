package org.example.lesson_18_FileInputStream_OutputStream.serial;

import com.github.javafaker.Faker;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person777 person777 = new Person777(new Faker().name().name(),25);
        System.out.println("Before serialization: ");
        System.out.println("Name: " + person777.getName());
        System.out.println("Age: " + person777.getAge());

        // Serial object to file
        try {
        // ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person777);
            out.close();
            fileOut.close();
            System.out.println("\nSerialization was done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Person777 newPerson;

        // Deserialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            newPerson = (Person777) in.readObject();
            in.close();
            System.out.println("\nDeserialization was done");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nAfter serialization: ");
        System.out.println("Name: " + newPerson.getName());
        System.out.println("Age: " + newPerson.getAge());
    }
}
