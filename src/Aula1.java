import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args){

        double tempF = 50.00;
        double tempC = ConverteTemp(tempF);
        System.out.printf("A temperatura em Celsius é de: %.2f", tempC);
    }

    public static double ConverteTemp(double tempF){
        double tempC = (tempF - 32) * 5 / 9;
        return tempC;
    }
}
