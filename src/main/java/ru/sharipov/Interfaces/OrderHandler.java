package ru.sharipov.Interfaces;

import ru.sharipov.Classes.Product;

public interface OrderHandler {
    void processOrderPush(Product product, Integer amount, DeliveryMethod deliveryMethod);
    void processOrderPull(Product product, Integer amount);

}
