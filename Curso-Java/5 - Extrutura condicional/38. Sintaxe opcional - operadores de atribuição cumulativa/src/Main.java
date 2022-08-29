import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    /*
      a += b;  a = a + b;
      a -= b;  a = a - b;
      a *= b;  a = a * b;
      a /= b;  a = a / b;
      a %= b;  a = a % b;
     */

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int minutes = scanner.nextInt();

    double conta = 50.0;

    if(minutes > 100){
       conta += (minutes-100) * 2.0;
    }

    System.out.printf("Valor da conta =  RS %.2f%n", conta);

    scanner.close();

    }
}