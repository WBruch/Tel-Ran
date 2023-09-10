package summaryFriday.sum_08_09;

public class Park {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Bobik", 2, "black");
        Animal animal2 = new Cat("Tom", 4);


//      dog.bark();
        animal1.feed();
        animal2.feed();

        ((Dog)animal1).bark();
    }
}
