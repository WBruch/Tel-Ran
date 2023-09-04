package practice2.classwork.polymorphism;

public class Square extends Shape {
    public void area() {
        System.out.println("Square are is a^2");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
