package service;

public class Logger {
    private Logger() {
        throw new IllegalStateException("Utility class");
      }
    
    public static void logOrder(double totalPrice) {
        System.out.println("El total de la orden es: " + totalPrice);
    }
}
