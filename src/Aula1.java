import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int tempF = sc.nextInt();
        int tempC = ConverteTemp(tempF);
        System.out.printf("A temperatura em Celsius é de: %.d", tempC);

        sc.close();
    }

    public static int ConverteTemp(int tempF){
        int tempC = 5 * ((tempF - 32 / 9));
        return tempC;
    }
}
