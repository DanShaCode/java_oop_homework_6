package ru.sharipov.Interfaces;

import ru.sharipov.Classes.HomeDelivery;
import ru.sharipov.Classes.Product;
import ru.sharipov.Classes.SelfDelivery;

public interface OrderHandler {
    void processSelfOrderPush(Product product, Integer amount, SelfDelivery selfDelivery);
    void processHomeOrderPush(Product product, Integer amount, HomeDelivery homeDelivery);
    void processOrderPull(Product product, Integer amount);

}
