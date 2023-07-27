package Aula7;

public class A07EX02 {
    public static void main(String[] args) {
        int fatorial = fatorial(5);
        System.out.printf("Soma fatorial: %d", fatorial);
        int fatorialRecursivo = fatorialRecursivo(5);
        System.out.println();
        System.out.printf("Soma fatorial 2: %d", fatorialRecursivo);
    }

    public static int fatorial(int numero){
        int soma = 1;
        for(int i = 1; i <= numero; i++){
            soma *= i;
        }
        return soma;
    }

    public static int fatorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }

        return numero * fatorialRecursivo(numero - 1);
    }
}
