import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {

      /*
       * Estrutura condicional
       */

      System.out.println("Quantas Horas?");

      int hrs;
      Scanner sc = new Scanner(System.in);
      hrs = sc.nextInt();

      if (hrs < 0 || hrs > 24) {
         System.out.println("Dado inválido!");
      } else if (hrs < 12) {
         System.out.println("Bom dia!");
      } else if (hrs < 18) {
         System.out.println("Boa tarde!");
      } else {
         System.out.println("Boa noite!");
      }

      sc.close();

   }
}