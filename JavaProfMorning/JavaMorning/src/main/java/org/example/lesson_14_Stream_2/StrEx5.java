package org.example.lesson_14_Stream_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrEx5 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 2, 1, 6, 5, 4, 9, 9, 9, 9, 8, 7);
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");

        // mapToInt -> IntStream
        int sum = list.stream()
                //        (digit -> digit.intValue())
                .mapToInt(Integer::intValue)
                .sum();

        int sum1 = words.stream()
                //       (str -> str.hashCode())
                .mapToInt(String::hashCode)
                .sum();


        List<Em> emList = Arrays.asList(
                new Em("A","B",2500),
                new Em("c","q",4540),
                new Em("v","w",1200),
                new Em("b","e",2460),
                new Em("n","r",13200),
                new Em("m","t",5600),
                new Em("l","y",10000),
                new Em("r","oo",2990)
        );

        // groupingBy
        Map<String,List<Em>> map = emList.stream()
                .collect(Collectors.groupingBy(emp -> {
                    if (emp.getSalary() <= 5000) {
                        return "LOW";
                    } else if (emp.getSalary() <= 10000) {
                        return "HIGH";
                    } else return "MEDIUM";
                }));
        System.out.println(map);

       List<String> stringList = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .toList();
        System.out.println(stringList);


    }
}

class Em {
    private String firstName;
    private String lastName;
    private int salary;

    public Em(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Em{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}