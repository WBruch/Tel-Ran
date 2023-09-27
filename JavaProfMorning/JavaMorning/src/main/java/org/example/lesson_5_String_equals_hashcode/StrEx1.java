package org.example.lesson_5_String_equals_hashcode;

public class StrEx1 {
    public static void main(String[] args) {
        String nik = "Nik";
        String nik2 = "Nik";

//        System.out.println(nik.equals(nik2));  true

//        System.out.println(nik == nik2);       true

        String nik77 = new String("Nik");
        System.out.println(nik.equals(nik77));
        System.out.println(nik == nik77);
    }
}
