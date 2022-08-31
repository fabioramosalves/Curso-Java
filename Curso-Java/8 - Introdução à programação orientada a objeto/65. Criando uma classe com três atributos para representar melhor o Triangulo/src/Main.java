import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {
    public static void main(String[] args) throws Exception {

        // criando uma classe com tres atributos para representar melhor um triangulo

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        // area do triangulo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the messures of triangle X");
        x.a = scanner.nextInt();
        x.b = scanner.nextInt();
        x.c = scanner.nextInt();

        System.out.println("Enter the messures of triangle Y");
        y.a = scanner.nextInt();
        y.b = scanner.nextInt();
        y.c = scanner.nextInt();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        MaxArea(areaX, areaY);

        scanner.close();
    }

    public static void MaxArea(double x, double y) {
        double result;
        String triangle;
        if (x > y) {
            result = x;
            triangle = "X";

        } else {
            result = y;
            triangle = "Y";
        }

        System.out.printf("Larger area: %s %.4f%n", triangle, result);
    }
}