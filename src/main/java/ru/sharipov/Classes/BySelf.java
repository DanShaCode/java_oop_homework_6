package ru.sharipov.Classes;


import ru.sharipov.Interfaces.DeliveryMethod;


public class BySelf implements DeliveryMethod {

    @Override
    public void deliverProduct(Product product) {
        System.out.println("Данный " + product + " был отдан на складе");
    }
}
