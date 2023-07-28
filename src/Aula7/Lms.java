package Aula7;

import java.text.DecimalFormat;

public class Lms {
    public static String[] soletrandoStr(String input) {
        String palavra[] = new String[input.length()];
        for(int i = 0; i < input.length(); i++){
            palavra[i] = String.valueOf(input.charAt(i));
        }
        return palavra;
    }


    public static String numeroPertenceASequenciaFibonacci(int input) {
        StringBuilder sequencia = new StringBuilder();
        int num1 = 0;
        int num2 = 1;

        while (num1 <= input) {
            sequencia.append(num1).append(", ");
            int soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }

        return sequencia.substring(0, sequencia.length() - 2);
    }

    public static int[] ordenar(int[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        return input;
    }

    public static double salarioComComissao( double[] input) {
        double qtdCarros = input[0];
        double totalVendas = input[1];
        double salarioFixo = input[2];
        double valorFixoCarro = input[3];
        DecimalFormat df = new DecimalFormat("#.00");

        double salarioFinal = (valorFixoCarro * qtdCarros) + salarioFixo + (totalVendas * 0.05);
        String salarioFinalFormatado = df.format(salarioFinal);
        salarioFinal = Double.parseDouble(salarioFinalFormatado);


        return salarioFinal;
    }

    public static String parImpar(int[] input) {
        int pares = 0;
        int impares = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                pares++;
            }
            else impares++;
        }

        return String.format("%d pares, %d ímpar" , pares, impares);
    }

}
