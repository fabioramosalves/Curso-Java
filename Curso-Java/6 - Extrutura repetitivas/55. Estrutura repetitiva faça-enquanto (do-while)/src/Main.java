import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        char stop;
        do{

        System.out.println("Digite a temperatura em Celsius: ");
        double c = scanner.nextDouble();

        System.out.printf("Equivalente em Fahreheit: %.1f%n", 9 * c / 5 + 32);       

        System.out.println("Deseja repetir (s/n)");

        stop = scanner.next().charAt(0);

        }while(stop == 's');

        scanner.close();
     
    }
}