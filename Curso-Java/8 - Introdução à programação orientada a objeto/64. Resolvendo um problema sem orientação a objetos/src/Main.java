import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        // area do triangulo
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the messures of triangle X");
        xA = scanner.nextInt();
        xB = scanner.nextInt();
        xC = scanner.nextInt();

        System.out.println("Enter the messures of triangle Y");
        yA = scanner.nextInt();
        yB = scanner.nextInt();
        yC = scanner.nextInt();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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