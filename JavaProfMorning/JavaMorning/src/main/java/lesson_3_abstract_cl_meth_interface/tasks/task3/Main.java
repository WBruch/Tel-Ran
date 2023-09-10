package lesson_3_abstract_cl_meth_interface.tasks.task3;
/**
ТЗ 3: Интернет-магазин с различными продуктами

        Абстрактный класс: Product
        Интерфейс: Discountable

        Задача:
        Разработать интернет-магазин, в котором можно продавать различные продукты с
        возможностью применения скидок. Создать абстрактный класс Product,
        содержащий информацию о продукте (название, цена) и методы для получения информации.
        Создать интерфейс Discountable, который имеет метод applyDiscount(double percentage)
        для применения скидки к продукту. Реализовать два класса, PhysicalProduct и DigitalProduct,
        наследующихся от абстрактного класса Product. Класс PhysicalProduct может иметь наценку за доставку,
        а класс DigitalProduct не имеет такой наценки.
*/
public class Main {
    public static void main(String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct("Phone", 500, 10);
        DigitalProduct digitalProduct = new DigitalProduct("Ebook", 20);

        physicalProduct.applyDiscount(100);
        digitalProduct.applyDiscount(25);

        System.out.println("Physical product price after discount: " + physicalProduct.getPrice());
        System.out.println("Digital product price after discount: " + digitalProduct.getPrice());
    }
}