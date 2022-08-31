package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        var currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        currencyConverter.price = scanner.nextDouble();

        System.out.println("How many dollars will be bought?");
        currencyConverter.dollars = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = R$ %.2f%n", currencyConverter.converter());
        scanner.close();
        
    }
}
