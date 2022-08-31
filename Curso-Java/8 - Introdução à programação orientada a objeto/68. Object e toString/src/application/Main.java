package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

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

        System.out.println(product.toString());
        // System.out.println(product); //implicitamento pode retornar apenas com
        // product sem o product.toString()

        scanner.close();
    }
}