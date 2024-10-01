package util;

public class TaxCalculator {
    private TaxCalculator() {
        throw new IllegalStateException("Utility class");
      }
    public static double calculateTax(double totalPrice) {
        return totalPrice * 0.18;  // Magic number para el impuesto
    }
}
