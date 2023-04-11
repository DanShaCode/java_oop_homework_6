package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.MarketWarehouse;


public interface WarehouseInfo {
    void getWarehouseInfo(MarketWarehouse marketWarehouse);

    void getWarehouseCurrentAmount(MarketWarehouse marketWarehouse);
}
