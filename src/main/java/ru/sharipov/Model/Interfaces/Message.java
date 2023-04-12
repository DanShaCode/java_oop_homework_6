package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.Product;

public interface Message {
    void selfDeliveryMessage(Product product);
    void homeDeliveryMessage(Product product, String adress);
}
