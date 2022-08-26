import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    // Para fazer entrada de dados, nós vamos criar uma objeto do tipo
    //Scanner da seguinte forma:

    Scanner sc = new Scanner(System.in);

    // para ler uma palavra (texto sem espaços)

    System.out.println("Digite um valor:");
    String result = sc.nextLine();

    System.out.println("Você digitou: " + result);
     
    // entrada com ponto flutuante

    Locale.setDefault(Locale.US);

    System.out.println("Digite um valor:");
    double resultDouble = sc.nextDouble();

    System.out.println("Você digitou double: " + resultDouble);

    System.out.printf("Você digitou double: %.2f%n ", resultDouble);

    //lendo caracter

    char cha;

    cha = sc.next().charAt(0);
    System.out.println("Você digitou char: "+ cha);


     // para ler varios dados na mesma linha utulizar 


     String a;
     int b;
     double c;

     a = sc.next();
     b = sc.nextInt();
     c = sc.nextDouble();

     System.out.println("Dados digitados:");
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);

    sc.close();

    }
}