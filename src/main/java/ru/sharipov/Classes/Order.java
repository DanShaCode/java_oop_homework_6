package ru.sharipov.Classes;

import ru.sharipov.Interfaces.DeliveryMethod;
import ru.sharipov.Interfaces.OrderHandler;

public class Order implements OrderHandler {

    @Override
    public void processOrderPush(Product product, Integer amount, DeliveryMethod deliveryMethod) {
        if (amount <= product.getQuantity()){
            product.decreaseQuantity(amount);
            deliveryMethod.deliverProduct(product);
        } else
            System.out.println("К");
    }

    @Override
    public void processOrderPull(Product product, Integer amount) {
        product.increaseQuantity(amount);
        System.out.println("Склад пополнился данным продуктом: " + product.getName()
                + " на " + amount);
    }

}
