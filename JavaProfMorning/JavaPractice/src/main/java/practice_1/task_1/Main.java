package practice_1.task_1;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal(23.5, 4, "Garry");
        Animal animal2 = new Animal(2.5, 2, "Bobik");
        Chicken chicken = new Chicken(1.2, 1, "Fer");


        System.out.println(animal1.getName());
        chicken.fly();
    }
}
