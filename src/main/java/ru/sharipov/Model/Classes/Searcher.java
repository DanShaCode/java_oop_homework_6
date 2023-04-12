package ru.sharipov.Model.Classes;

import ru.sharipov.Model.Interfaces.ProductSearcher;
import ru.sharipov.View.View;

public class Searcher implements ProductSearcher {

    @Override
    public void findProductByName(MarketWarehouse marketWarehouse, String productName, View view) {
        System.out.println();
        for (Product product : marketWarehouse.getWareHouseProductList())
            if (product.getName().contains(productName))
                view.printProduct(product);
        System.out.println();
    }

    public void findQuantitySearchFrom(MarketWarehouse marketWarehouse, Integer value, View view) {
        System.out.println();
        for (Product product : marketWarehouse.getWareHouseProductList())
            if (product.getQuantity() >= value)
                view.printProduct(product);
        System.out.println();
    }

    public void findQuantitySearchUpTo(MarketWarehouse marketWarehouse, Integer value, View view) {
        System.out.println();
        for (Product product: marketWarehouse.getWareHouseProductList())
            if (product.getQuantity() <= value)
                view.printProduct(product);
        System.out.println();
    }

    public void findPriceSearchFrom(MarketWarehouse marketWarehouse, Double value, View view) {
        System.out.println();
        for (Product product: marketWarehouse.getWareHouseProductList())
            if (product.getPrice() >= value)
                view.printProduct(product);
        System.out.println();
    }

    public void findPriceSearchUpTo(MarketWarehouse marketWarehouse, Double value, View view) {
        System.out.println();
        for (Product product: marketWarehouse.getWareHouseProductList())
            if (product.getPrice() <= value)
                view.printProduct(product);
        System.out.println();
    }
}
