package com.mycompany.solartoyour;

import static com.mycompany.solartoyour.CalculoSimulacao.energiaGeradaTotal;

public class CalculoSimulacao {
    
    
    public static double quantidadePaineis (double consumoMensal, double potenciaPainelEmWatts, double HorasDeSol){
        double potenciaPainelKW = potenciaPainelEmWatts / 1000.0; // Convertendo Watts para kW
        
        //Aqui e feito o calculo Mensal por paienl Solar 
        double energiaMensalPorPainel = potenciaPainelKW * HorasDeSol * 30;
        //Esse Math.cell so esta arredondando o numero para cima , pois nao tem como instalar meio painel solar
        return Math.ceil(consumoMensal / energiaMensalPorPainel); 
        
        
    }
    public static double energiaGeradaTotal(double quantidadePaineis, double potenciaPainelWatts, double horasDeSol) {
    double potenciaPainelKW = potenciaPainelWatts / 1000.0;
    return quantidadePaineis * potenciaPainelKW * horasDeSol * 30;
    }
//Isso seria usado para saber quanto a pessoa paga por mes em cada kwh mas , como estamos pedindo o valor da conta de energia dela os valores da tarifa local ja estao inclusas no valor da conta
    //public static double economiaMensal (double consumoMensal, String cidade){
        //double tarifa = 0;
    
        //if (cidade.equalsIgnoreCase("São Paulo")) {  //igual da combo Box 
         //   tarifa = 0.17;
       // }
     //   return consumoMensal * tarifa;
 //   }
    public static double economiaMensal(double consumoMensalR$,double consumoMensal,double quantidadePaineis, double potenciaPainelWatts, double horasDeSol){
        
        if(consumoMensal <= 0 ) return 0;
        double energiaGerada = energiaGeradaTotal(quantidadePaineis, potenciaPainelWatts, horasDeSol);
        double valorKWh = consumoMensalR$ / consumoMensal;
        return energiaGerada * valorKWh;
        
        

}        
    public static double reducaoCO2 (double consumoMensal){
        return consumoMensal * 0.5 * 12;
    }

    public static double roi (double investimentoTotal, double economiaMensal){
        return investimentoTotal / economiaMensal;
    }
}
