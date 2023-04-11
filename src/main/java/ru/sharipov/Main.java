package ru.sharipov;

import ru.sharipov.Classes.*;

public class Main {
    public static void main(String[] args) {

        // Creating a Warehouse
        MarketWarehouse marketWarehouse = new MarketWarehouse(1000);

        //Creating a Product
        Product milk = new Product("Milk", 100, 59.99);
        Product butter = new Product("Butter", 250, 19.99);

        //Add Product to Warehouse
        marketWarehouse.addProduct(milk);
        marketWarehouse.addProduct(butter);

        //Show Warehouse Products and Warehouse Amount
        System.out.println(marketWarehouse.getWareHouseProductList());
        System.out.println(marketWarehouse.getWarehouseAmount());

        //Creating DeliveryMethod
        SelfDelivery selfDelivery = new SelfDelivery();
        HomeDelivery homeDelivery = new HomeDelivery();

        //Creating Order
        Order order = new Order();

        //Resolve Order
        order.processSelfOrderPush(milk, 100,selfDelivery);
        order.processHomeOrderPush(butter, 100, homeDelivery);

    }
}
