package Aula6;

import Aula6.enums.Estado;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A06EX02 {

    public static void main(String[] args) throws EstadoInvalidoException {

        System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);

        try {
            valorProdutoFinal(250.10, "DF");
        } catch (EstadoInvalidoException e) {
            System.out.println("Estado inválido!");
        }
    }


    public static double valorProdutoFinal(double valorProduto, String estadoDestino) throws EstadoInvalidoException {
        return arredondar(valorProduto * (1.0 + (Estado.valueOf(estadoDestino).getTaxaImposto()/100.0)));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
