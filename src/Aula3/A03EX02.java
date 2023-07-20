package Aula3;

public class A03EX02
{
    public static double[] custosCarro(double[] input) {
        double precoFinal = input[0];
        double custoDistribuidor = input[1];
        double custoImpostos = input[2];

        double percentualDistribuidor = (custoDistribuidor /  precoFinal) * 100;
        double percentualImpostos = (custoImpostos / precoFinal) * 100;

        percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
        percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;

        double[] result = { percentualDistribuidor, percentualImpostos };
        return result;
    }

    public static void main(String[] args) {
        double[] entrada1 = { 238500, 18350, 32450 };
        double[] resultado1 = custosCarro(entrada1);
        System.out.println("Saída 1: [" + resultado1[0] + ", " + resultado1[1] + "]");

        double[] entrada2 = { 115500.00, 25000.00, 32500.00 };
        double[] resultado2 = custosCarro(entrada2);
        System.out.println("Saída 2: [" + resultado2[0] + ", " + resultado2[1] + "]");
    }
}