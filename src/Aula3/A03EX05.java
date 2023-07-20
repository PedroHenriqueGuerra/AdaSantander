package Aula3;

public class A03EX05 {
    public static boolean elementosRepetidos(double[] input) {
        for(int i = 0; i < input.length; i++){
            for(int j = i + 1; j < input.length; j++){
                if(input[j] == input[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
