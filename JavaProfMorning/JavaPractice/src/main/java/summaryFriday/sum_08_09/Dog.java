package summaryFriday.sum_08_09;

import java.util.PrimitiveIterator;

public class Dog extends Animal{


    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark() {
        System.out.println("gav-gav");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
