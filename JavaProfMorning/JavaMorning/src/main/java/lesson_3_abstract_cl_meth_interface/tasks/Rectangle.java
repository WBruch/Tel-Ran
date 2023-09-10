package lesson_3_abstract_cl_meth_interface.tasks;

public class Rectangle extends Shape implements Resizable{
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;



    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public void resize(double factor) {
        length = length * factor;
        width = width * factor;
    }
}
