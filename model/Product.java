package model;

public class Product {
    private String productId;
    private double price;
    private int stock;

    public Product(String productId, double price, int stock) {
        this.productId = productId;
        this.price = price;
        this.stock = stock;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Stock insuficiente para el producto " + productId);
        }
    }
}
