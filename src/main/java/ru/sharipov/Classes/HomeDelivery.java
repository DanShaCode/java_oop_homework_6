package ru.sharipov.Classes;

import ru.sharipov.Interfaces.DeliveryMethod;

public class HomeDelivery implements DeliveryMethod {

    @Override
    public void deliverProduct(Product product) {
        System.out.println("Данный " + product + " был отправлен доставкой на дом");
    }
}
