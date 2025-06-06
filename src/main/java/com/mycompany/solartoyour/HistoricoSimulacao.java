package com.mycompany.solartoyour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.DAO;
import DAO.DAOPainel;

public class HistoricoSimulacao {
    private int id_painel;
    private int id_usuario;
    private double consumoPrevio;
    private double consumoApos;
    private double reducaoCO2;
    private double  economia;

    
    //construtor que usa do DAO para já atribuir os corretos IDs ao usuario e ao painel 
    public HistoricoSimulacao(Usuario usuario,Paineis painel,double consumoApos, double consumoPrevio, double economia, double reducaoCO2) throws SQLException {
        this.consumoApos = consumoApos;
        this.consumoPrevio = consumoPrevio;
        this.economia = economia;
        this.reducaoCO2 = reducaoCO2;
        this.id_usuario = DAO.id_usuario(usuario);
        this.id_painel = DAOPainel.id_painel(painel);
    }

    //Método que arquivará as informações dada ao construtor no BD
    public void ArquivarSimulacao ()throws SQLException{
        String sql = "insert tb_historico (id_usuario,id_painel, consumo_mensal_seguinte,consumo_mensal_previo,reducao_CO2, economia) values (?,?,?,?,?,?)";
        try (Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id_usuario);
            ps.setInt(2, id_painel);
            ps.setDouble(3,consumoApos);
            ps.setDouble(4,consumoPrevio);
            ps.setDouble(5, reducaoCO2);
            ps.setDouble(6, economia);

            ps.execute();
        } 
    }

    //metodo que retorna todos os valores do historico de um usuario 
    public static double[] getHistorico (Usuario usuario)throws SQLException{
        double[] valores = {0,0,0,0,0,0};
        String sql = "select * from tb_historico where id_usuario = ?";
        try (Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, usuario.getId_usuario());

            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                    valores[0] = rs.getInt("id_usuario");
                    valores[1] = rs.getInt("id_painel");
                    valores[2] = rs.getDouble("consumo_mensal_previo");
                    valores[3] = rs.getDouble("consumo_mensal_seguinte");
                    valores[4] = rs.getDouble("reducao_CO2");
                    valores[5] = rs.getDouble("economia");
                    //os valores são retornados na ordem:
                    //id_usuario | id_painel | consumo_mensal_previo | consumo_mensal_seguinte | redução_CO2 | economia
                }
            }
        }
        return valores;
    }
}
