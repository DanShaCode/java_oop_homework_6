package ru.sharipov.Model.Classes;

import lombok.NoArgsConstructor;
import ru.sharipov.Model.Interfaces.OrderHandler;
import ru.sharipov.View.View;

@NoArgsConstructor
public class Order implements OrderHandler {

    @Override
    public void processHomeOrderPush(Integer productId, Integer amount, HomeDelivery homeDelivery, MarketWarehouse marketWarehouse, String adress, View view) {
        for (Product product: marketWarehouse.getWareHouseProductList()){
            if (product.getProductId() == productId){
                homeDelivery.deliverProduct(product, adress, view);
                product.decreaseQuantity(amount);
                marketWarehouse.setWarehouseAmount(marketWarehouse.getWarehouseAmount() + amount);
            }
        }
    }

    @Override
    public void processOrderPull(Integer productId, Integer amount, SelfDelivery selfDelivery, MarketWarehouse marketWarehouse, View view) {
        for (Product product: marketWarehouse.getWareHouseProductList()){
            if (product.getProductId() == productId){
                selfDelivery.deliverProduct(product, view);
                product.decreaseQuantity(amount);
                marketWarehouse.setWarehouseAmount(marketWarehouse.getWarehouseAmount() - amount);
            }
        }
    }

}
