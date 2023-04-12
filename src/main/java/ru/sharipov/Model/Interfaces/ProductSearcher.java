package ru.sharipov.Model.Interfaces;

import ru.sharipov.Model.Classes.MarketWarehouse;
import ru.sharipov.View.View;

public interface ProductSearcher {
    void findProductByName(MarketWarehouse marketWarehouse, String productName, View view);

}
