import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String day;

        if (x == 1)
            day = "domingo";
        else if (x == 1)
            day = "segunda";
        if (x == 1)
            day = "terça";
        else if (x == 1)
            day = "quarta";
        if (x == 1)
            day = "quinta";
        else if (x == 1)
            day = "sexta";
        if (x == 1)
            day = "sábado";
        else
            day = "Dado inválido";

        System.out.println(day);

        // extrutura swich-case

        switch (x) {
            case 1:
                day = "domingo";
                break;
            case 2:
                day = "segunda";
                break;
            case 3:
                day = "terça";
                break;
            case 4:
                day = "quarta";
                break;
            case 5:
                day = "quinta";
                break;
            case 6:
                day = "sexta";
                break;
            case 7:
                day = "sábado";
                break;
            default:
                day = "Dado inválido";
                break;

        }

        scanner.close();

    }
}