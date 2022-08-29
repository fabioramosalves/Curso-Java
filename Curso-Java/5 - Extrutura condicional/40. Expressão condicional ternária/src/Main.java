import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //expressão condicional ternária

        //(condição) ? valor_se_verdadeiro : valor_se_falso


        Scanner scanner = new Scanner(System.in);

        double pricing = 34.5;

        double desc = (pricing < 20) ? pricing * 0.1 : pricing * 0.05;

        System.out.println(desc);

        scanner.close();
     
    }
}