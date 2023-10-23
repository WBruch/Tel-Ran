package org.example.lesson_17_Exeptions_and_IO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ET1 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Please enter a digit ");

            try (Scanner scanner = new Scanner(System.in);) {
                int digit = scanner.nextInt();
                System.out.println("Digit: " + digit);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It is not a digit !!! Try again");
            }
        }
        System.out.println("END");

    }
}
