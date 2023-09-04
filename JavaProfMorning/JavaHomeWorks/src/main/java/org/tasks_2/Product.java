package org.tasks_2;

import lombok.AllArgsConstructor;


public class Product {

    int id;
    String name;
    ProductCategory category;
    double price;
    Currency currency;

    public Product(int id, String name, ProductCategory category, double price, Currency currency) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
}

class Clothing {

    ClothingSize size;

    public Clothing(ClothingSize size) {
        this.size = size;
    }

    public ClothingSize getSize() {
        return size;
    }


}

