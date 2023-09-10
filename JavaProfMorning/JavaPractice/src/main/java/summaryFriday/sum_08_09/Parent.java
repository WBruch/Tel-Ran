package summaryFriday.sum_08_09;

public abstract class Parent {

    private String parenData;
    public static String staticParentData;

    {
        System.out.println("data from Parent init block");
    }

   static  {
       System.out.println("static init block from Parent");
       staticParentData = "data from static init Parent";
    }
    public Parent(){
        System.out.println("Parent constructor");
        this.parenData = "Test parent data from constructor Parent";
    }

    public String getParenData() {
        return parenData;
    }
}
