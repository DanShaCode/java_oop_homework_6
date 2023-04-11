package ru.sharipov.Classes;


import ru.sharipov.Interfaces.SelfDeliveryInterface;


public class SelfDelivery implements SelfDeliveryInterface {

    @Override
    public void deliverProduct(Product product) {
        System.out.println("Продукт " + product.getName() + " был отдан на складе.");
    }
}
