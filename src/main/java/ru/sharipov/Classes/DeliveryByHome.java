package ru.sharipov.Classes;

import ru.sharipov.Interfaces.DeliveryMethod;

public class DeliveryByHome implements DeliveryMethod {

    @Override
    public void deliverProduct(Product product) {
        System.out.println("Продукт " + product.getName() + " был отправлен доставкой на дом.");
    }
}
