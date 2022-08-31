package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");

        double radius = scanner.nextDouble();

        double circumference = circumference(radius);

        double volume = volume(radius);

        System.out.printf("Circunferência: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Pi value: %.2f%n", Math.PI);

        scanner.close();

    }

    private static double volume(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    private static double circumference(double radius) {
        return Math.PI * radius * 2;
    }
}
