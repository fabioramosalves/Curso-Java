public class Main {
    public static void main(String[] args) throws Exception {

        // ---------Processamento de dados em Java------------

        // <variável> = <expressão>

        // Exemplo 1

        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        // Exemplo 2

        int xx;
        double yy;
        xx = 5;
        yy = 2 * xx;

        System.out.println(xx);
        System.out.println(yy);

        // Exemplo 3

        double area, h, b, B;
        b = 6.0;
        h = 5.0;
        B = 8.0;
        area = (b + B) / 2 * h;

        System.out.println("Area: " + area);

        //Exemplo 4 casting

        int a, c;
        double resultado;

        a = 5;
        c = 2;

        resultado = (double) a / c; //casting double

        System.out.println(resultado);

        // Exemplo 5

        double aa;
        int bb;

        aa = 5.0;
        // bb = aa; // O compilador não deixa atribuir uma variável que perderá valor deve se utilizar o casting
        bb =(int) aa;
        
        System.out.println(bb);
    }
}