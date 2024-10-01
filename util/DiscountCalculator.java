package util;

import model.Order;
import model.User;

public class DiscountCalculator {
    public static double calculateDiscount(User user, Order order) {
        if ("premium".equals(user.getUserType())) {
            return 0.15;  // Magic number
        } else if ("regular".equals(user.getUserType()) && order.getItemsCount() > 5) {
            return 0.10;  // Magic number
        }
        return 0;
    }
}
