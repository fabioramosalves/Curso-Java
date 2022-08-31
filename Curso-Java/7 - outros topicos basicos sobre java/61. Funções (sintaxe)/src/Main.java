import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // funções representam um processamento que possui um significado

        // principais vantagens: moduralização, delegação e reaproveitamento

        double x = Math.sqrt(25); // recebe paremetro retorna double

        System.out.println(x); // recebe parametro e não retorna só imprime na tela

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        showResult(MaxNumbers(a, b, c));

        scanner.close();
    }

    public static int MaxNumbers(int a, int b, int c) {
        int aux;
        if (a > b && a > c)
            aux = a;
        if (b > c)
            aux = b;
        else
            aux = c;

        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}