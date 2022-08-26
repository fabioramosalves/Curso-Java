import java.util.Locale;

public class Main {
        public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

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
        System.out.printf("%.4f%n", y);
    }
}