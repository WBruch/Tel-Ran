package org.tasks_2;

import java.util.ArrayList;
import java.util.Arrays;

import static org.tasks_2.Currency.*;
import static org.tasks_2.ProductCategory.*;

public class ShopManager {

    ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProductsByCategory(ProductCategory category) {

        ArrayList<Product> sortedProducts = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).category.equals(category)) {
                sortedProducts.add(products.get(i));
            }
        }

        return sortedProducts;
    }

    public ArrayList<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {

        ArrayList<Product> sortedProducts = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).currency.equals(currency) && products.get(i).price >= minPrice
                    && products.get(i).price <= maxPrice) {
                sortedProducts.add(products.get(i));
            }
        }

        return sortedProducts;
    }

    public static void main(String[] args) {

        ShopManager baryga = new ShopManager();

        ArrayList<Product> products1 = new ArrayList<>();

        Product Hemd = new Product(01, "H&M", SHIRT, 19.99, EUR);
        Product pork = new Product(23, "Lacoste", DRESS, 49.99, USD);
        Product prod3 = new Product(65, "Polo", PANTS, 39.99, GBP);
        Product prod4 = new Product(23, "Gucci", DRESS, 199.97, EUR);
        Product prod5 = new Product(22, "Lidl", SHIRT, 9.90, EUR);

        baryga.addProduct(Hemd);
        baryga.addProduct(pork);
        baryga.addProduct(prod4);
        baryga.addProduct(prod5);
        baryga.addProduct(prod3);

       baryga.getProductsByCategory(DRESS);

       baryga.getProductsByPriceRange(50.0,200.0,EUR);
    }

}
