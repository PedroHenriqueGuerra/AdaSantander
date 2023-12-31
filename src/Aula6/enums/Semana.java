package Aula6.enums;

public enum Semana {
    DOMINGO("domingo", 1),
    SEGUNDA_FEIRA("segunda-feira", 2),
    TERCA_FEIRA("terça-feira", 3),
    QUARTA_FEIRA("quarta-feira", 4),
    QUINTA_FEIRA("quinta-feira", 5),
    SEXTA_FEIRA("sexta-feira", 6),
    SABADO("sábado", 7);
    final String nome;
    final int dia;

    Semana(String nome, int dia){
        this.nome = nome;
        this.dia = dia;
    }

    public String getNome(){
        return nome;
    }

    public int getDia() {
        return dia;
    }

    public static Semana stringParaDia(String nome){
        for(Semana dia : Semana.values()){
            if(dia.getNome().equalsIgnoreCase(nome)){
                return dia;
            }
        }
        throw new IllegalArgumentException("Dia inválido");
    }

}
