package summaryFriday.sum_08_09;

public class Child {
    private String childData;

    public static String childStaticData;

    {
        System.out.println("init block Child");
    }

    static {
        System.out.println("Static init block Child");
    }

    public Child(){
        System.out.println("Child constructor");
        this.childData = "test child data from constructor";
    }
}
