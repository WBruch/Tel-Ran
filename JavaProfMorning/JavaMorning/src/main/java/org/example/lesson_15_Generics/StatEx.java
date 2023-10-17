package org.example.lesson_15_Generics;

public class StatEx {
    static int st = 0;
    int nonSt = 0;

//    public static void main(String[] args) {
//        StatEx o1 = new StatEx();
//        StatEx o2 = new StatEx();
//
//        o1.nonSt = 777;
//        System.out.println(o2.nonSt);
//    }
public static void main(String[] args) {
    StatEx o1 = new StatEx();
    StatEx o2 = new StatEx();

    StatEx.st = 999;
    System.out.println(o2.st);
}
}
