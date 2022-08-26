import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws Exception {

      /*
       * Estrutura condicional
       * 
       */
      int x;
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();

      if (x >= 0 && x <= 12)
         System.out.println("Bom dia!");

      if (x > 12 && x < 18)
         System.out.println("Boa tarde!");

      if (x >= 18 && x <= 24)
         System.out.println("Boa noite!");

      if (x < 0 || x > 24)
         System.out.println("Dado inválido!");

      sc.close();

   }
}