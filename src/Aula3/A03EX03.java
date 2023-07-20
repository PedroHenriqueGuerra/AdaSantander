package Aula3;

public class A03EX03
{
    public static double calculoSalario(double[] input) {
        double tempoServico = input[0];
        double valorInflacao = input[1];
        double salarioFuncionario = input[2];
        double percentualTotal;
        double salarioFuncionarioAjustado = 0.00;

        if(tempoServico >= 1 && tempoServico <= 5){
            percentualTotal = 1.01 + (valorInflacao / 100);
            salarioFuncionarioAjustado = salarioFuncionario * percentualTotal;
        }
        else if (tempoServico > 5 && tempoServico <= 10) {
            percentualTotal = 1.015 + (valorInflacao / 100);
            salarioFuncionarioAjustado = salarioFuncionario * percentualTotal;
        }
        else if (tempoServico > 10) {
            percentualTotal = 1.02 + (valorInflacao / 100);
            salarioFuncionarioAjustado = salarioFuncionario * percentualTotal;
        }

        salarioFuncionarioAjustado = Math.round(salarioFuncionarioAjustado * 100.0) / 100.0;
        return salarioFuncionarioAjustado;
    }


}

