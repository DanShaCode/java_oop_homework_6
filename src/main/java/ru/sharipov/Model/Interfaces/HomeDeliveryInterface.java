package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.Product;
import ru.sharipov.View.View;

public interface HomeDeliveryInterface {
    public void deliverProduct(Product product, String adress, View view);
}
