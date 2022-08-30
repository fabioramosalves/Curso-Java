import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

     //exercicio 1

     Scanner scanner = new Scanner(System.in);

     System.out.println("digite a senha");

     int senha = scanner.nextInt();

     while(senha != 2002){
        System.out.println("Senha inválida!");
        senha = scanner.nextInt();    
     }

     System.out.println("Acesso Permitido");

     scanner.close();

    }
}