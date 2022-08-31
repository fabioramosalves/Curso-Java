package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scanner.nextLine();

        System.out.println("Price: ");
        product.price = scanner.nextDouble();

        System.out.println("Quantity in Stock ");
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");

        int quantity = scanner.nextInt();

        product.addProducts(quantity);

        System.out.println("Update Product data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to removed from stock: ");

        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("Removed Product data: " + product.toString());

        scanner.close();
    }
}