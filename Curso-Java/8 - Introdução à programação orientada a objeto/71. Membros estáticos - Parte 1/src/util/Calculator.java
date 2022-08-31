package util;

public class Calculator {
    public double volume(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    public double circumference(double radius) {
        return Math.PI * radius * 2;
    }
}
