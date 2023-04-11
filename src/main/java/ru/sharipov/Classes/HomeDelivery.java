package ru.sharipov.Classes;

import ru.sharipov.Interfaces.HomeDeliveryInterface;

public class HomeDelivery implements HomeDeliveryInterface {

    @Override
    public void deliverProduct(Product product, String adress) {
        System.out.println("Продукт " + product.getName() + " был отправлен доставкой на дом" +
                " по адресу: " + adress);
    }
}
