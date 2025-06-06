package com.mycompany.solartoyour;

public class teste {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Giovanni","Giovanni@Gmail.com", "123");
        Paineis painel = new Paineis("Filme fino","descrição", 123.99);

        HistoricoSimulacao hs = new HistoricoSimulacao(usuario, painel, 100.01, 100.02, 100.03, 100.04);
        System.out.println(hs.toString());

        //hs.ArquivarSimulacao();

        double[] valores = HistoricoSimulacao.getHistorico(usuario);
        for (double d : valores) {
            System.out.println(d);
        }
    }
}
