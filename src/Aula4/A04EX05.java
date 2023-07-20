package Aula4;

public class A04EX05 {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

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
