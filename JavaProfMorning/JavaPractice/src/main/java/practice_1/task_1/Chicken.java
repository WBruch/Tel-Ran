package practice_1.task_1;

public class Chicken extends Animal implements Flyable{
    public Chicken(double weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
