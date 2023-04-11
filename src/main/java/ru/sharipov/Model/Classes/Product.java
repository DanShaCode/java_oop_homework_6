package ru.sharipov.Model.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private static Integer idCounter = 0;
    private Integer productId;
    private String name;
    private Integer quantity;
    private Double price;

    public Product(String name, Integer quantity, Double price) {
        productId = ++idCounter;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void increaseQuantity(Integer amount) {
        quantity += amount;
    }

    public void decreaseQuantity(Integer amount) {
        quantity -= amount;
    }

    @Override
    public String toString() {
        return "| ID: " + getProductId() + " | Наименование : " + getName()
                + " | Количество: " + getQuantity() + " | Цена: " + getPrice();
    }

}
