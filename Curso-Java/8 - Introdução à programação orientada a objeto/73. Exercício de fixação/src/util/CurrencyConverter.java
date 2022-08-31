package util;

public class CurrencyConverter {
    public double price;
    public double dollars;
    public double value;

    public double converter() {
        var result = price * dollars;
        return result + (result * 0.06);
    }
}
