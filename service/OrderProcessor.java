package service;

import model.Order;
import model.Product;
import model.User;
import util.DiscountCalculator;
import util.TaxCalculator;

public class OrderProcessor {
    private Order order;
    private User user;
    private double totalPrice;

    public OrderProcessor(Order order, User user) {
        this.order = order;
        this.user = user;
        this.totalPrice = 0;
    }

    public double processOrder() {
        // Calcular el precio total
        for (Product product : order.getProducts()) {
            totalPrice += product.getPrice();
        }

        // Aplicar descuento basado en el tipo de usuario
        double discount = DiscountCalculator.calculateDiscount(user, order);
        totalPrice -= totalPrice * discount;

        // Aplicar impuestos
        double tax = TaxCalculator.calculateTax(totalPrice);
        totalPrice += tax;

        // Retornar el precio total con descuento e impuestos
        return totalPrice;
    }
}
