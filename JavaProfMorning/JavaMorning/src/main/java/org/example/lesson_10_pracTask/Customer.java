package org.example.lesson_10_pracTask;

import lombok.Data;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
@Data
public class Customer {
    private UUID customerId = new UUID(12,21);
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private ArrayList<Product> customerPurchases;
    private Map<Product, Integer> customerCart;
    private Map<Product,Review> reviews;
}
