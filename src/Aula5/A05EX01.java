package Aula5;

import static util.Input.lerInt;

public class A05EX01 {
    public static void main(String[] args) throws QuantidadeInvalidaException {
        String[] frutas = {"Pera", "Laranja", "Maca", "Tomate", "Caqui", "Morango"};
        int[] quantidades = new int[frutas.length];

        System.out.println("Bem vindo a feira. Coloque a quantidade desejada para cada fruta");

        for(int i = 0; i < frutas.length; i++){
            String nomeFruta = frutas[i];
            quantidades[i] = lerInt(nomeFruta + ": ");
            validarItens(quantidades[i]);
        }

        double valorTotal = calcularValorCompra(quantidades);

        System.out.printf("Valor total: %.2f", valorTotal);
    }

    public static double calcularValorCompra(int[] quantidades) {
        double valorCompra = 0;

        for (int quantidade : quantidades) {
            valorCompra += calcularPreco(quantidade);
        }

        return valorCompra;
    }

    public static double calcularPreco(int quantidade) {
        double valorPromocao = 1.25;
        double valorNormal = 1.45;

        if(quantidade > 10){
            return valorPromocao * quantidade;
        } else {
            return valorNormal * quantidade;
        }
    }

    private static void validarItens(int itens) throws QuantidadeInvalidaException {
        if (itens == 0 ){
            throw new QuantidadeInvalidaException("Quantidade não pode ser 0.");
        }
        if (itens < 0){
            throw new QuantidadeInvalidaException("Quantidade não pode ser negativa.");
        }

        }

}
