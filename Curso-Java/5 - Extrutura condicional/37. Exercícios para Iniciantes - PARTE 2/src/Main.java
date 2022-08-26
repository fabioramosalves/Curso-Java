import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Informe um número!");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // exercicio 1
        System.out.println(number < 0 ? "NEGATIVO" : "NÃO NEGATIVO");

        // exercicio 2
        System.out.println(number % 2 == 0 ? "Par" : "Impar");

        // exercicio 3
        System.out.println("Informe os numeros!");
        int number1, number2;

        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        System.out.println((number1 % number2 == 0 || number2 % number1 == 0) ? "Sao Multiplos" : "Nao sao Multiplos");

        // exercicio 4

        int start, finaly, duration;

        start = scanner.nextInt();
        finaly = scanner.nextInt();

        duration = 0;

        if (start < finaly)
            duration = finaly - start;
        else
            duration = 24 - start + finaly;

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");

        // exercicio 5

        Locale.setDefault(Locale.US);

        int quantity, code;

        double value;

        code = scanner.nextInt();
        quantity = scanner.nextInt();

        value = 0f;

        if (code == 1) {
            value = 4.0;
        } else if (code == 2) {
            value = 4.5;
        } else if (code == 3) {
            value = 5.0;
        } else if (code == 4) {
            value = 2.0;
        } else {
            value = 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", value * quantity);

        // exercicio 6

        scanner.close();

    }
}