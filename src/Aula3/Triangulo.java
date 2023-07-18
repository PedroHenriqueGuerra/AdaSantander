package Aula3;

public class Triangulo {

    public static void main(String[] args) {
        double area = calculaArea(9, 7, 14);
        System.out.printf("A área do triangulo é de: %.2f", area);
    }
    public static double calculaArea(int a, int b, int c){
        int p = (a + b + c) / 2;
        double area =  (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return area;
    }
}
