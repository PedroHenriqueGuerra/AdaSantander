package Aula3;

public class SubStrings {
    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            boolean repetido = false;

            for (int j = 0; j < input.length(); j++) {
                if (i != j && caracter == input.charAt(j)) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                return i;
            }
        }
        return -1;
    }

}
