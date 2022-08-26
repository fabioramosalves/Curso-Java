import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); // massete deve ser incluído um nexline para seguir
        
        s1 = sc.nextLine(); // Ler até o final da linha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}