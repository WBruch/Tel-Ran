package summaryFriday.sum_08_09;

public class Cat extends Animal{


    private static int catCount;

    public Cat(String name, int age) {

        super(name, age);
        catCount++;
    }
}
