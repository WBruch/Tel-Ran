package practice2.classwork.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();  // Create a Shapes object
        Shape myTriangle = new Triangle();  // Create a Triangle object
        Shape myCircle = new Circle();  // Create a Circle object
        Shape mySquare = new Square();  // Create a Circle object
        myShape.area();
        myTriangle.area();
        myCircle.area();
        mySquare.area();

        // В этом примере метод draw() переопределяется в подклассах,
        // и это позволяет программе определять,
        // какой метод использовать во время выполнения.
        // Это известно как полиморфизм времени выполнения или динамический полиморфизм.
        // Поскольку во время выполнения JVM
        // определяет фактический тип объекта и вызывает соответствующий метод.
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output: "Drawing a square"

        //Во время компиляции Java знает, какой метод вызывать, проверяя сигнатуры метода.
        //So, this is called compile time polymorphism or static linking.
        s1.area(10);
        s1.area(10,50);
    }

}
