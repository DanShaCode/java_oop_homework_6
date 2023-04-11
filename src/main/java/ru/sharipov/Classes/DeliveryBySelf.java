package ru.sharipov.Classes;


import ru.sharipov.Interfaces.DeliveryMethod;


public class DeliveryBySelf implements DeliveryMethod {

    @Override
    public void deliverProduct(Product product) {
        System.out.println("Продукт " + product.getName() + " был отдан на складе.");
    }
}
