package summaryFriday.sum_15_09;

public class TestEquals {

    public static void main(String[] args) {

        String s1 = "Some string";
        String s2 = "Some string";
        String s3 = s1;
        String s4 = new String("Some string");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println("-------------------");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

    }
}