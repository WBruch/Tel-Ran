package practice2.classwork.abstraction;

public class ClassicPhone extends AbstractPhone {

    public ClassicPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Классический телефон звонит");
    }
}
