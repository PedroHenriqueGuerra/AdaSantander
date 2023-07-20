package Aula2;

import java.util.Scanner;

public class A02EX01 {
    public static void main(String[] args) {
        String[] frutas = {"Pera", "Laranja", "Maca", "Tomate", "Caqui", "Morango"};
        int[] quantidades = new int[frutas.length];

        System.out.println("Bem vindo a feira. Coloque a quantidade desejada para cada fruta");

        for(int i = 0; i < frutas.length; i++){
            String nomeFruta = frutas[i];
            quantidades[i] = lerInt(nomeFruta + ": ");
        }

        double valorTotal = calcularValorCompra(quantidades);

        System.out.printf("Valor total: %.2f", valorTotal);
    }

    public static double calcularValorCompra(int[] quantidades) {
        double valorCompra = 0;

        for(int i = 0; i < quantidades.length; i++){
            valorCompra += calcularPreco(quantidades[i]);
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

    public static int lerInt(String msg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);
        int valor = scanner.nextInt();
        scanner.nextLine();

        return valor;
    }
}