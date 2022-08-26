public class Main {
    public static void main(String[] args) throws Exception {

        // Funções matemáticas em Java

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " Elevado a " + y + " potência = " + A);
        System.out.println(y + " Elevado ao quadrado = " + B);
        System.out.println("5 Elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        // Incluindo funções em expressões maiores

        double delta, b, a, c, x1, x2;

        a = 3.0;
        b = 7.0;
        c = 5.0;

        delta = (Math.pow(b, 2.0) - 4) * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}