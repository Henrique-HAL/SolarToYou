package com.mycompany.solartoyour;

import java.io.IOException;
import java.sql.SQLException;

public class teste {
    public static void main(String[] args) throws SQLException, IOException {
    //    double[] valores = Historico.getHistorico("1");
    //    for (double d : valores) {
    //        System.out.println(d);
    //    }
        TXT.deletar();
        TXT.salvar(1);
        TXT.ler();
        
    }
    

}
