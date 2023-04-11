package ru.sharipov.Interfaces;

import ru.sharipov.Classes.Product;

import java.util.List;

public interface Warehouse {

    void addProduct(Product product);
    void removeProduct(Product product);
    void getWarehouseInfo();
    void getProductInfo(Product product);

}
