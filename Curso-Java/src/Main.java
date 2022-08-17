import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


     //   %f = ponto flutuante
     //   %d = inteiro
     //   %s = texto
     //   %n = quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}