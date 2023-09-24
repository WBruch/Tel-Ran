package summaryFriday.sum_22_09;

public class UseMyCustomArrayList {

    public static void main(String[] args) {

        MyCustomArrayList list = new MyCustomArrayList(new String[] {"one","two","Three"});
        for (String current :
                list) {
            System.out.println(current);
        }
    }

}
