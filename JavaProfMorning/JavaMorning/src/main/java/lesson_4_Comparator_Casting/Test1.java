package lesson_4_Comparator_Casting;

public class Test1 implements Interf{
    public static void main(String[] args) {

    }

    @Override
    public void absM() {
        System.out.println("abs M");
    }
}

interface Interf {

    void absM();

    default void defM() {
        System.out.println("def M");
    }

    static void statM() {
        System.out.println("stat M");
    }
}
