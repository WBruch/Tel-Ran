package lesson_3_abstract_cl_meth_interface.tasks;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(1.5);
        System.out.println("Circle area after resizing: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.resize(2);
        System.out.println("Rectangle area after resizing: " + rectangle.calculateArea());
    }
}
