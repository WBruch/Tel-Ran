package practice2.classwork.polymorphism;

public class Shape {
    public void area() {
        System.out.println("The formula for area of ");
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area=" + 0.5 * b * h);
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area=" + l * b);
    }
}
