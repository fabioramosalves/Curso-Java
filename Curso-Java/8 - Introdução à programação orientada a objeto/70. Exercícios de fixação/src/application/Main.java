package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

    public static void main(String[] args) {
        
        //Exercicio 1:

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");     

        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA: %.2f%nPERIMETER: %.2f%nDIAGONAL: %.2f%n ", rectangle.area(),rectangle.perimeter(), rectangle.diagonal());

        scanner.close();
        
    }
    
}
