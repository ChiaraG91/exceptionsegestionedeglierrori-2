public class Main {

    public static void main(String[] args) {

        System.out.println(compareChar("a"));
    }

    public static boolean compareChar(String character) {
        for (int i = 0; i < character.length(); i++) {
                if (Character.isDigit(character.charAt(i))) {
            } else {
                throw new ArithmeticException("Errore: il carattere non è un numero");

            }
        }
        return true;
    }

}