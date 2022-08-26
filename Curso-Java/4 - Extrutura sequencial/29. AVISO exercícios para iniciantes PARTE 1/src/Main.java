import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        // ------------Exercício 1---------------
        int a, b, result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor a ser somado!");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor a ser somado!");
        b = scanner.nextInt();
        result = a + b;
        System.out.println("SOMA = " + result);

        // ------------Exercício 2---------------

        double raio, pi, area;

        pi = 3.14159;

        System.out.println("Digite o raio!");

        raio = scanner.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n", area);

        // ------------Exercício 3---------------

        System.out.println("Digite os 4 números entre espaço!");

        int A, B, C, D, dif;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

        // ------------Exercício 4---------------

        double number, hour, hourValue, salary;

        number = scanner.nextDouble();
        hour = scanner.nextDouble();
        hourValue = scanner.nextDouble();
        salary = hour * hourValue;

        System.out.printf("NUMBER %.0f%nU$ %.2f%n", number, salary);

        // ------------Exercício 5---------------

        int quantity;
        double unitValue, total;

        scanner.nextInt();
        quantity = scanner.nextInt();
        unitValue = scanner.nextDouble();

        total = quantity * unitValue;

        scanner.nextLine();

        scanner.nextInt();
        quantity = scanner.nextInt();
        unitValue = scanner.nextDouble();

        total += (quantity * unitValue);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        // ------------Exercício 5---------------
        double AA,BB, CC, altura, base, largura, r, triangulo, circulo, trapezio, quadrado, retangulo;

        AA = (double)scanner.nextDouble();
        BB = (double)scanner.nextDouble();
        CC = (double)scanner.nextDouble();

        base = AA;
        altura = CC;
        largura = BB;
        r = altura;

        retangulo = base * largura;
        triangulo = base * altura / 2;
        trapezio = (base + largura) * altura / 2;
        quadrado = Math.pow(largura, 2.0);
        circulo = 3.14159f * Math.pow(r, 2.0);

        System.out.printf(" TRIANGULO: %.3f%n CIRCULO: %.3f%n TRAPEZIO: %.3f%n QUADRADO %.3f%n RETANGULO %.3f%n",
                triangulo, circulo, trapezio, quadrado, retangulo);

        scanner.close();

    }
}