package Aula3;

public class Triangulo {

    public static void main(String[] args) {
        double area = calculaArea(10, 15, 0);
        if(area > 0){
            System.out.printf("A área do triangulo é de: %.2f", area);

        }
        else{
            System.out.println("Os lados informados não formam um triangulo");
        }

    }
    public static double calculaArea(int a, int b, int c){
        boolean triangulo = verificaTriangulo(a, b, c);
        if(triangulo) {
            int p = (a + b + c) / 2;
            double area =  (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            return area;
        }
        else return 0;
    }

    public static boolean verificaTriangulo(int a, int b, int c){
        if (a < b + c || b < a + c || c < a + b){
            return true;
        }
        else return false;
    }
}
