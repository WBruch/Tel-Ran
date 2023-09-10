package practice_3.task4;

public class Duck extends Bird implements Flyable, Swimable{
    public Duck(String name, BirdType type) {
        super(name, type);
    }

    @Override
    void voice() {
        System.out.println("Krya-krya");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String toString() {
        return "Duck{" +
                "type=" + type.getAbility() +
                '}';
    }
}
