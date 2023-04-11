package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.HomeDelivery;
import ru.sharipov.Model.Classes.MarketWarehouse;
import ru.sharipov.Model.Classes.Product;
import ru.sharipov.Model.Classes.SelfDelivery;
import ru.sharipov.View.View;

public interface OrderHandler {
    void processHomeOrderPush(Integer productId, Integer amount, HomeDelivery homeDelivery, MarketWarehouse marketWarehouse, String adress, View view);
    void processOrderPull(Integer productId, Integer amount, SelfDelivery selfDelivery, MarketWarehouse marketWarehouse, View view);

}
