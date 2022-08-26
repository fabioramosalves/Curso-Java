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

        scanner.close();

    }
}