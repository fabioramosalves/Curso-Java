import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // exercicio 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a senha");

        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");
            senha = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

        // Exercício 2
        int x, y;
        String q = "";
        x = scanner.nextInt();
        y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                q = "primeiro";
            } else if (x < 0 && y > 0) {
                q = "segundo";
            } else if (x < 0 && y < 0) {
                q = "terceiro";
            } else {
                q = "quarto";
            }

            System.out.println(q);

            x = scanner.nextInt();
            y = scanner.nextInt();
        }
         //Exercício 3

        int codigo, alcool, gasolina, diesel;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        codigo = scanner.nextInt();

        while (codigo != 4) {
            switch (codigo) {
                case 1:
                alcool += 1;
                break;
                case 2:
                gasolina += 1;
                break;
                case 3:
                diesel += 1;
                break;
            }

            codigo = scanner.nextInt();
        }

        System.out.printf("Muito Obrigado! %n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina,diesel);

        scanner.close();
    }
}