package practice_3.task4;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, BirdType type) {
        super(name, type);
    }

    @Override
    void voice() {

    }

    @Override
    public void fly() {

    }

    @Override
    public String toString() {
        return "Sparrow{" +
                "type=" + type.getAbility() +
                '}';
    }
}
