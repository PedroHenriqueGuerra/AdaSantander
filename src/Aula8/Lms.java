package Aula8;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Lms {

    public static void main(String[] args) {

    }

    public static int somaAlgarismos(int input) {
        String numero = Integer.toString(input);
        if (Integer.parseInt(numero) <= 0){
            return -1;
        }
        else{
            int soma = 0;
            for(int i = 0; i < numero.length(); i++){
                int n = numero.charAt(i) - '0';
                soma += n;
            }
            return soma;

        }
    }

    public static String[] substringStr( String[] input) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String palavraAtual = input[i];
            for (int j = 0; j < input.length; j++) {
                if (i != j && input[j].contains(palavraAtual)) {
                    substrings.add(palavraAtual);
                    break;
                }
            }
        }

        return substrings.toArray(new String[0]);
    }

    public static double valorProdutoFinal(double[] input) {
        double valorProduto = input[0];
        double estado = input[1];
        DecimalFormat df = new DecimalFormat("#.0000");
        if(estado != 1.0 && estado != 2.0 && estado != 3.0){
            return -1;
        }
        else{
            if(estado == 1.0){
                valorProduto += valorProduto * ((double) 7 /100);
            }
            else if (estado == 2.0) {
                valorProduto += valorProduto * ((double) 12 / 100);
            }
            else valorProduto += valorProduto * ((double) 15 / 100);
        }
        String valorProdutoFormatado = df.format(valorProduto);
        valorProduto = Double.parseDouble(valorProdutoFormatado);
        return valorProduto;
    }

    public static String[] soletrandoInvertidoStr(String input) {
        char [] palavra = input.toCharArray();
        String [] arrayInvertido = new String [palavra.length];
        for(int i = 0; i < palavra.length; i++){
            arrayInvertido[i] = Character.toString(palavra[palavra.length - 1 - i]);
        }
        return arrayInvertido;
    }

    public static double valorEntrada(double[] input) {
        double diaDaSemana = input[0];
        double precoEntrada = input[1];
        double aoVivo = input[2];
        double valorPagar;
        double desconto = ((double)25 / 100);
        double acrescimoAoVivo = precoEntrada * ((double) 15 / 100);
        DecimalFormat df = new DecimalFormat("#.0000");

        if(diaDaSemana == 1.0 || diaDaSemana == 2.0 || diaDaSemana == 4.0){
            if(aoVivo == 1.0){
                valorPagar = precoEntrada + acrescimoAoVivo;
                desconto = valorPagar * desconto;
                valorPagar -= desconto;
            }
            else {
                desconto = precoEntrada * desconto;
                valorPagar = precoEntrada - desconto;
            }
        }
        else {
            if(aoVivo == 1.0){
                valorPagar = precoEntrada + acrescimoAoVivo;
            }
            else valorPagar = precoEntrada;
        }
        String valorPagarFormatado = df.format(valorPagar);
        valorPagar = Double.parseDouble(valorPagarFormatado);

        return valorPagar;
    }

}


