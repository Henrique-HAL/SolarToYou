package com.mycompany.solartoyour;

public class CalculoSimulacao {
    public static double quantidadePaineis (double consumoMensal, double potenciaPainel){
        return consumoMensal / (potenciaPainel * 12 * 30);
    }

    public static double economiaMensal (double consumoMensal, double tarifaLocal){
        return consumoMensal * tarifaLocal;
    }

    public static double reducaoCO2 (double consumoMensal){
        return consumoMensal * 0.5 * 12;
    }

    public static double roi (double investimentoTotal, double economiaMensal){
        return investimentoTotal / economiaMensal;
    }
}
