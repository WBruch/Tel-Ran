package practice2.classwork.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        // create an object of the subclass
        Dog labrador = new Dog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}
