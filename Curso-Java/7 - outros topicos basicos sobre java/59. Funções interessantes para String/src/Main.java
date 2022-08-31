public class Main {
    public static void main(String[] args) throws Exception {

        String origin = "abcd FGHIJ abc DEFG    ";

        String s01 = origin.toLowerCase();
        String s02 = origin.toUpperCase();
        String s03 = origin.trim();
        String s04 = origin.substring(2);
        String s05 = origin.substring(2, 9);
        String s06 = origin.replace("a", "x");
        String s07 = origin.replace("abc", "xy");
        int i = origin.indexOf("bc");
        int j = origin.lastIndexOf("bc");

        System.out.println("Original: " + origin + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace(a, x): -" + s06 + "-");
        System.out.println("replace(abc, xy): -" + s07 + "-");
        System.out.println("indexOf: -" + i + "-");
        System.out.println("lastIndexOf: -" + j + "-");

        // função Operadores split

        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        String word1 = null, word2 = null, word3 = null;
        try {
            word1 = vect[0];
            word2 = vect[1];
            word3 = vect[2];
        } catch (Exception e) {

            System.out.println(e);
        }

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}