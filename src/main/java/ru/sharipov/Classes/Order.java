package ru.sharipov.Classes;

import ru.sharipov.Interfaces.DeliveryMethod;
import ru.sharipov.Interfaces.OrderHandler;

public class Order implements OrderHandler {

    @Override
    public void processOrderPush(Product product, Integer amount, DeliveryMethod deliveryMethod) {
        product.decreaseQuantity(amount);
        deliveryMethod.deliverProduct(product);
    }

    @Override
    public void processOrderPull(Product product, Integer amount) {
        product.increaseQuantity(amount);
        System.out.println("Склад пополнился данным продуктом: " + product.getName()
                + " на " + amount);
    }

}
