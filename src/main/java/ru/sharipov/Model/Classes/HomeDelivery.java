package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.HomeDeliveryInterface;
import ru.sharipov.View.View;

public class HomeDelivery implements HomeDeliveryInterface {

    @Override
    public void deliverProduct(Product product, String adress, View view) {
        view.homeDeliveryMessage(product, adress);
    }
}
