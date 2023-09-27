package org.task_5;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

@Data
public class StoreManager {
    private List<Product> products;
    private List<Customer> customers;

    // Метод, который вычисляет среднюю цену продуктов в магазине.
    public double calculateAverageProductPrice() {
        int counter = 0;
        double sum = 0;

        for (Product current :
                products) {
            sum += current.getProductPrice();
            counter++;
        }
        return sum / counter;
    }

    // Метод, который возвращает список электронных адресов клиентов, сделавших покупки
// в заданном ценовом диапазоне.
    public List<String> listCustomerEmailsForPriceRange(double minPrice, double maxPrice) {
        List<String> result = new ArrayList<>();
        for (Customer current :
                customers) {
            for (Product prod :
                    current.getCustomerPurchases()) {
                if (prod.getProductPrice() >= minPrice && prod.getProductPrice() <= maxPrice)
                    result.add(current.getCustomerEmail());
            }
        }
        return result;
    }

    // Метод, который добавляет новый продукт в магазин.
    public void addProductToStore(Product product) {
        products.add(product);
    }

    // Метод, который удаляет продукт из магазина.
    public void removeProductFromStore(Product product) {
        products.remove(product);
    }

    // Метод, который добавляет продукт в корзину клиента с указанным количеством.
    public void addToCart(Customer customer, Product product, int quantity) {
        customer.getCustomerCart().put(product, quantity);
    }

    // Метод, который оформляет покупку продуктов из корзины клиента.
    public void purchaseCart(Customer customer) {
        for (Entry current :
                customer.getCustomerCart().entrySet()) {
            for (int i = 0; i < (int) current.getValue(); i++) {
                customer.getCustomerPurchases().add((Product) current.getKey());
            }
        }
    }
}
