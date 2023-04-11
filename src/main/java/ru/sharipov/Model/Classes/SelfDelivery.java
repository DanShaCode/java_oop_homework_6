package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.SelfDeliveryInterface;
import ru.sharipov.View.View;

public class SelfDelivery implements SelfDeliveryInterface {
    @Override
    public void deliverProduct(Product product, View view) {
        view.selfDeliveryMessage(product);
    }
}
