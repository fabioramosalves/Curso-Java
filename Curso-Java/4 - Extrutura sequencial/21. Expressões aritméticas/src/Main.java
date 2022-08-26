import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

    
      // Operadores aritiméticos

      // + (Adição)
      // - (subtração)
      // * (multiplicação)
      // / (divisão)
      // % (resto da divisão - "mod")

      // precedência (quem faz primeiro) 
      // primeiro * / %
      // segundo + -

      var result = 2 * 6/3; // result = 4

      result = 3 + 2 * 4; // result = 11

      result = (3 + 2) * 4; // result = 20

      result = 60/(3 + 2) * 4; // result = 48

      result = 60/((3 + 2) * 4); // result = 3

      System.out.println("Resultado: " + result);

    }
}