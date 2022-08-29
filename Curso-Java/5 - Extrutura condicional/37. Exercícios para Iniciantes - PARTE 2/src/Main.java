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

              System.out.println(
                            (number1 % number2 == 0 || number2 % number1 == 0) ? "Sao Multiplos" : "Nao sao Multiplos");

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

              double intervalo;
              String valor;
              Locale.setDefault(Locale.US);
              intervalo = scanner.nextDouble();

              if (intervalo < 0 || intervalo > 100) {
                     valor = "Fora de intervalo";
              } else if (intervalo == 0 && intervalo <= 25) {
                     valor = "([0,25]";
              } else if (intervalo > 25 && intervalo <= 50) {
                     valor = "(25,50]";
              } else if (intervalo > 50 && intervalo <= 75) {
                     valor = "([50,75]";
              } else
                     valor = "([75,100]";

              System.out.println("Intervalo " + valor);
              // exercicio 7

              double x, y;
              String q;

              x = scanner.nextDouble();
              y = scanner.nextDouble();

              q = "";

              if (x == 0 && y == 0)
                     q = "Origem";
              else if (x == 0)
                     q = "Eixo Y";
              else if (y == 0)
                     q = "Eixo X";
              else if (x >= 0 && y >= 0)
                     q = "Q1";
              else if (x < 0 && y <= 0)
                     q = "Q2";
              else if (x < 0 && y < 0)
                     q = "Q3";
              else if (x >= 0 && y < 0)
                     q = "Q4";

              System.out.println(q);

              // exercicio 7

              double salary, tax;

              salary = scanner.nextDouble();

              if (salary <= 2000)
                     tax = 0;
              else if (salary <= 3000)
                     tax = (salary - 2000) * 0.8;

              else if (salary <= 4500)
                     tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;

              else
                     tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

              if (tax == 0.0)
                     System.out.println("Isento");
              else
                     System.out.printf("R$ %.2f%n", tax);

              scanner.close();
       }
}