public class Main {
    public static void main(String[] args) throws Exception {

        // escopo de uma variáve é a região do programa onde a variável é válida, ou
        // seja onde ela pode ser referenciada.

        // Uma variável não pode ser usada se não for iniciada

        double price = 400.0;
        double discount;

        if (price < 200)
            discount = price * 0.1;
        else
            discount = 0;

        System.out.println(discount);

    }
}