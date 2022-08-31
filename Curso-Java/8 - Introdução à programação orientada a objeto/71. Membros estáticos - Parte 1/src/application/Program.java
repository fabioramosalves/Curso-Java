package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter radius: ");

        double radius = scanner.nextDouble();

        double circumference = calculator.circumference(radius);

        double volume = calculator.volume(radius);

        System.out.printf("Circunferência: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Pi value: %.2f%n", Math.PI);

        scanner.close();

    }

  
}
