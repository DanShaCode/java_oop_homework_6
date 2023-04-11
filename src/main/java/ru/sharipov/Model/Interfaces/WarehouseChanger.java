package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.Product;

public interface WarehouseChanger {
    void addProduct(Product product);
    void removeProduct(Product product);
}
