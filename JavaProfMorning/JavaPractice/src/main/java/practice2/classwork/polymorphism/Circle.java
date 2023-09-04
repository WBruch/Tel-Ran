package practice2.classwork.polymorphism;

public class Circle extends Shape {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
