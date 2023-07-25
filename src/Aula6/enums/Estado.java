package Aula6.enums;

public enum Estado {

    MG(7),
    SP(12),
    RJ(15);

    final int taxaImposto;

    Estado(int taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public int getTaxaImposto() {
        return taxaImposto;
    }



}
