package practice_3.task3;

/**
 * Зная, что такое абстрактный класс, абстрактный метод
 * создать структуру классов реализующих несколько устройств принтеров, цветной и струйный.
 * <p>
 * Запустить код, который распечатает строки, указывающие, какой принтер сейчас печатает
 */
public class Main {
    public static void main(String[] args) {
        Printer colorprinter = new ColorPrinter();
        colorprinter.print();
        Printer blackPrinter = new BlackPrinter();
        blackPrinter.print();
    }
}
