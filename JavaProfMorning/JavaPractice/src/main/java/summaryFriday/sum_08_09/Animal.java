package summaryFriday.sum_08_09;

public class Animal {

    private String name;
    private int age;
    private boolean isHungry;

    public void feed() {
        System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
        isHungry = false;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
