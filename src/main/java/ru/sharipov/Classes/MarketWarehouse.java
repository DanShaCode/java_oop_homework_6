package ru.sharipov.Classes;

import lombok.Data;
import ru.sharipov.Interfaces.Warehouse;

import java.util.ArrayList;
import java.util.List;

@Data
public class MarketWarehouse implements Warehouse {
    List<Product> wareHouseProductList;
    private Integer warehouseAmount;

    public MarketWarehouse(Integer warehouseAmount) {
        this.wareHouseProductList = new ArrayList<>();
        this.warehouseAmount = warehouseAmount;
    }

    @Override
    public void addProduct(Product product) {
        wareHouseProductList.add(product);
        this.warehouseAmount = getWarehouseAmount() - product.getQuantity();
    }

    @Override
    public void removeProduct(Product product) {
        for (Product prod : wareHouseProductList)
            if (prod.equals(product)){
                wareHouseProductList.remove(product);
                this.warehouseAmount = getWarehouseAmount() + product.getQuantity();
            }
    }

    @Override
    public void getWarehouseInfo() {
        System.out.println(wareHouseProductList);
    }

    @Override
    public void getProductInfo(Product product) {
        for (Product prod : wareHouseProductList)
            if (prod.equals(product))
                System.out.println(prod);
    }

}
