package Aula4;

public class A04EX03 {
    public static void main(String[] args) {
        double[][] entradas = {
                {8.0, 7.0, 8.0, 8.0},
                {5.0, 4.3, 8.0, 7.0},
                {2.0, 5.0, 8.0, 6.0},
                {4.0, 1.0, 9.0, 7.0},
                {2.0, 2.0, 10.0, 1.0},
                {2.9, 2.5, 10.0, 7.1},
                {4.4, 4.1, 8.5, 9.5},
                {5.0, 7.0, 9.0, 8.0},
                {8.0, 7.0, 8.0, 9.0},
                {8.0, 8.0, 10.0, 9.0},
                {2.0, 2.0, 5.0, 1.0}
        };

        String[] saidas = {
                "B",
                "C",
                "C",
                "D",
                "D",
                "C",
                "C",
                "B",
                "B",
                "A",
                "D"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = mediaAproveitamento(entradas[i]);
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado.equals(esperado));
            System.out.println();
        }
    }

    public static String mediaAproveitamento(double[] input) {
        double N1 = input[0];
        double N2 = input[1];
        double N3 = input[2];
        double mediaExercicios = input[3];

        double mediaAproveitamento =    ((N1) + (N2 * 2) + (N3 * 3) + mediaExercicios) / 7;

        if(mediaAproveitamento >= 9.0){
            return "A";
        }
        else if (mediaAproveitamento >= 7.5) {
            return "B";
        }
        else if (mediaAproveitamento >= 6.0) {
            return "C";
        }
        else return "D";
    }
}