package practice_2.task1;





import java.util.Arrays;
import java.util.stream.IntStream;

public class EnumPractice {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));

        for (int i = 0; i < seasons.length; i++) {
            System.out.print(seasons[i].getMonth1() + " ");
            System.out.print(seasons[i].getMonth2() + " ");
            System.out.println(seasons[i].getMonth3());
        }


        System.out.println(Season.WINTER.getMonth2());
        System.out.println(Season.valueOf("SUMMER").getMonth1());
        System.out.print(Season.WINTER.valueOf("WINTER").ordinal());





    }
}