import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        // ---------para escrever na tela um texto qualquer-----------

        // Com quebra de linha
        System.out.println("Ola Mundo");

        // Sem quebra de linha
        System.out.println("Bom dia!");

        // --------Conteúdo de uma variável de um tipo basico

        int x = 8;
        double y = 8.6576;
        System.out.println("Valor: " + x);
        System.out.println("Valor: " + y);

        // Padrão para controle das casas decimais <"%.2f%n">

        System.out.printf("%.2f%n", y);

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);

        // para concatenar vários elementos em um mesmo comando de escrita
        System.out.println("Resultado: " + x + " Metros");

        // para concatenar vários elementos em um mesmo comando de escrita com printf
        System.out.printf("Resultado: %.2f metros%n", y);

        System.out.printf("Resultado: %.2f metros%n", y);

        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = quebra de linha

        String nome = "Maria";
        int idade = 56;
        double renda = 4050.55;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
    }
}