package ru.sharipov.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String name;
    private Integer quantity;
    private Double price;

    public void increaseQuantity(Integer amount) {
        quantity += amount;
    }

    public void decreaseQuantity(Integer amount) {
        quantity -= amount;
    }

}
