import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // for (inicio; condição; incremento)

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        int valor = 0;

        for (int i = 0; i < index; i++) {
            valor += scanner.nextInt();
        }

        System.out.println(valor);
        
        scanner.close();
    }
}