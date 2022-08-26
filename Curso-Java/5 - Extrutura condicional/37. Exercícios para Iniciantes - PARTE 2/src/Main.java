import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Main {
    public static void main(String[] args) throws Exception {

     // exercicio 1

     Scanner scanner = new Scanner(System.in);

     int number = scanner.nextInt();

     System.out.println(number<0 ? "NEGATIVO" : "NÃO NEGATIVO");

     
     
     scanner.close();

    }
}