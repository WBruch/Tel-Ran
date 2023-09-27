package org.example.lesson_3_abstract_cl_meth_interface.tasks.task3;

public class DigitalProduct extends Product implements Discountable{

    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void applyDiscount(double percentage) {
        super.setPrice(this.getPrice() - (this.getPrice() * percentage / 100));
    }
}
