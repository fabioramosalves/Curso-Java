import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite um número!");
     int number = scanner.nextInt();
     int value = 0;

     while(number != 0){
        value += number;
        System.out.println("Digite um número!");
        number = scanner.nextInt();
     }

     System.out.println(value);

     scanner.close();

    }
}