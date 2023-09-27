package org.task_5;

import lombok.Data;

import java.util.HashMap;
import java.util.UUID;
@Data
public class Product {
private UUID productId = new UUID(123,321);
private String productName;
private ProductCategory productCategory;
private double productPrice;
private int productStock;
private HashMap<Customer, Review> productReviews;
}
