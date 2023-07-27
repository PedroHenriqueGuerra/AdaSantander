package Aula7.enums;

import java.util.Arrays;

public enum Semana2 {
    DOMINGO(new String[] {"domingo", "d"},  1),
    SEGUNDA_FEIRA(new String[] {"segunda-feira", "sf"}, 2),
    TERCA_FEIRA(new String[] {"terça-feira", "terça"}, 3),
    QUARTA_FEIRA(new String[] {"quarta-feira", "quarta"}, 4),
    QUINTA_FEIRA(new String[] {"quinta-feira", "quinta"}, 5),
    SEXTA_FEIRA(new String[] {"sexta-feira", "sexta"}, 6),
    SABADO(new String[] {"sábado", "s"}, 7);
    final String[] nomes;
    final int dia;

    Semana2(String[] nomes, int dia){
        this.nomes = nomes;
        this.dia = dia;
    }

    public String[] getNomes(){
        return nomes;
    }

    public int getDia() {
        return dia;
    }

    public static Semana2 stringParaDia(String nomes){
        for(Semana2 dia : values()){
            for(String diaNome : dia.getNomes()){
                if(nomes.equalsIgnoreCase(diaNome)){
                    return dia;
                }
            }
        }
        throw new IllegalArgumentException("Dia inválido");
    }

}
