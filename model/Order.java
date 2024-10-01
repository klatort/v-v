package model;

import java.util.List;

public class Order {
    private List<Product> products;
    private int itemsCount;

    public Order(List<Product> products) {
        this.products = products;
        this.itemsCount = products.size();
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getItemsCount() {
        return itemsCount;
    }
}
