package ru.sharipov;

import ru.sharipov.Classes.*;
import ru.sharipov.Interfaces.DeliveryMethod;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 200, 59.99);
        Product butter = new Product("Butter", 200, 19.99);
        Product vine = new Product("Vine", 100, 399.99);
        MarketWarehouse marketWarehouse = new MarketWarehouse();
        marketWarehouse.addProduct(milk);
        marketWarehouse.addProduct(butter);
        marketWarehouse.addProduct(vine);
        marketWarehouse.getWarehouseInfo();
        Order order = new Order();
        DeliveryMethod bySelf = new BySelf();
        DeliveryMethod homeDelivery = new HomeDelivery();
        order.processOrderPush(milk, 50, bySelf);
        order.processOrderPush(butter, 100, homeDelivery);
        order.processOrderPush(vine, 100, homeDelivery);
        marketWarehouse.getWarehouseInfo();
        order.processOrderPull(vine, 25);
        marketWarehouse.getWarehouseInfo();
    }
}
