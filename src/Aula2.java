import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de frutas: ");
        int quantFrutas = sc.nextInt();
        double preco = CalculaPreco(quantFrutas);
        System.out.printf("O preço final da compra é de: %.2f", preco);

        sc.close();
    }

    public static double CalculaPreco(int quantFrutas){
        double precoFruta = 0;
        if (quantFrutas > 9){
            precoFruta = quantFrutas * 1.25;
        }
        else precoFruta = quantFrutas * 1.45;

        return precoFruta;
    }

}
