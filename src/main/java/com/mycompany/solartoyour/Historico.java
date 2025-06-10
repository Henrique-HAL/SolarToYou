package com.mycompany.solartoyour;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.DAOPainel;

public class Historico {
    private int id_painel;
    private String id_usuario;
    private double consumoPrevio;
    private double consumoApos;
    private double reducaoCO2;
    private double  economia;

    
    //construtor que usa do DAO para já atribuir os corretos IDs ao usuario e ao painel 
    public Historico(Paineis painel,double consumoApos, double consumoPrevio, double economia, double reducaoCO2) throws SQLException {
        this.consumoApos = consumoApos;
        this.consumoPrevio = consumoPrevio;
        this.economia = economia;
        this.reducaoCO2 = reducaoCO2;
        try {
            this.id_usuario = TXT.ler();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.id_painel = DAOPainel.id_painel(painel);
    }

    //Método que arquivará as informações dada ao construtor no BD
    public void ArquivarSimulacao ()throws SQLException{
        String sql = "insert tb_historico (id_usuario,id_painel, consumo_mensal_seguinte,consumo_mensal_previo,reducao_CO2, economia) values (?,?,?,?,?,?)";
        try (Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, id_usuario);
            ps.setInt(2, id_painel);
            ps.setDouble(3,consumoApos);
            ps.setDouble(4,consumoPrevio);
            ps.setDouble(5, reducaoCO2);
            ps.setDouble(6, economia);

            ps.execute();
        } 
    }

    //metodo que retorna todos os valores do historico de um usuario 
    public static double[] getHistorico (int id_usuario)throws SQLException{
        double[] valores = {0,0,0,0,0,0};
        String sql = "select * from tb_historico where id_usuario = ?";
        try (Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id_usuario);

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

    public static double[] getHistorico (String id_usuario)throws SQLException{
        double[] valores = {0,0,0,0,0,0};
        String sql = "select * from tb_historico where id_usuario = ?";
        try (Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, id_usuario);

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

    public static String getData(int id_usuario) throws SQLException{
        String data;
        String sql = "select dia from tb_historico where id_usuario = ?";
        try(Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, id_usuario);

            try(ResultSet rs = ps.executeQuery()){
                rs.next();
                data = rs.getString("dia");
            }
        }
        return data;
    }

    public static String getData(String id_usuario) throws SQLException{
        String data;
        String sql = "select dia from tb_historico where id_usuario = ?";
        try(Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, id_usuario);

            try(ResultSet rs = ps.executeQuery()){
                rs.next();
                data = rs.getString("dia");
            }
        }
        return data;
    }
}
