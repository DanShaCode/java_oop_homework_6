package ru.sharipov.Classes;

import lombok.NoArgsConstructor;
import ru.sharipov.Interfaces.OrderHandler;

@NoArgsConstructor
public class Order implements OrderHandler {

    @Override
    public void processSelfOrderPush(Product product, Integer amount, SelfDelivery selfDelivery) {
        product.decreaseQuantity(amount);
        selfDelivery.deliverProduct(product);
    }

    @Override
    public void processHomeOrderPush(Product product, Integer amount, HomeDelivery homeDelivery) {
        product.decreaseQuantity(amount);
        homeDelivery.deliverProduct(product, "ул.Маркса");
    }

    @Override
    public void processOrderPull(Product product, Integer amount) {
        product.increaseQuantity(amount);
        System.out.println("Склад пополнился данным продуктом: " + product.getName()
                + " на " + amount);
    }

}
