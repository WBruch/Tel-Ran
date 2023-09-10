package lesson_3_abstract_cl_meth_interface.tasks.task3;

public class PhysicalProduct extends Product implements Discountable {

    private double shippingCharge;

    public PhysicalProduct(String name, double price, double shippingCharge) {
        super(name, price);
        this.shippingCharge = shippingCharge;
    }

    @Override
    public void applyDiscount(double percentage) {
       setPrice(getPrice() - (getPrice() * percentage / 100) + getShippingCharge());
    }

    public double getShippingCharge() {
        return shippingCharge;
    }
}
