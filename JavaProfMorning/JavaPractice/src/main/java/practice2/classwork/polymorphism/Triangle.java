package practice2.classwork.polymorphism;

public class Triangle extends Shape {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }

    @Override
    public void draw() {
        System.out.println("Triangle a Square");
    }

}
