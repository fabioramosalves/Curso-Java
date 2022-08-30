import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // exercicios 1

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if (index >= 1 && index <= 1000) {
            for (int i = 0; i < index; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        }

        // exercicio 2

        index = scanner.nextInt();
        int out = 0, in = 0;
        for (int i = 0; i < index; i++) {

            int value = scanner.nextInt();
            if (value >= 10 && value <= 20) {
                in++;
            } else
                out++;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        // exercicio 3

        Locale.setDefault(Locale.US);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        scanner.close();
    }
}