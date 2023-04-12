package ru.sharipov.View;

import ru.sharipov.Model.Classes.MarketWarehouse;
import ru.sharipov.Model.Classes.Product;
import ru.sharipov.Model.Interfaces.Message;
import ru.sharipov.Model.Interfaces.WarehouseInfo;

public class View implements WarehouseInfo, Message {

    @Override
    public void getWarehouseInfo(MarketWarehouse marketWarehouse) {
        System.out.println();
        for (Product product: marketWarehouse.getWareHouseProductList())
            System.out.println(product);
        System.out.println();
    }

    @Override
    public void getWarehouseCurrentAmount(MarketWarehouse marketWarehouse) {
        System.out.println();
        System.out.println("Количество свободного места на складе: " + marketWarehouse.getWarehouseAmount());
        System.out.println();
    }

    @Override
    public void homeDeliveryMessage(Product product, String adress){
        System.out.println();
        System.out.println("Продукт " + product.getName() + " был отправлен доставкой на дом" +
                " по адресу: " + adress);
        System.out.println();
    }

    @Override
    public void selfDeliveryMessage(Product product){
        System.out.println();
        System.out.println("Продукт " + product.getName() + " был отдан на складе.");
        System.out.println();
    }

    public void printProduct(Product product) {
        System.out.println(product);
    }
}
