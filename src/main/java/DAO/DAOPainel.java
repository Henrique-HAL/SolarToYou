/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.solartoyour.ConexaoBD;
import com.mycompany.solartoyour.Paineis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class DAOPainel {
    
    //Aqui foi criado o metodo para verificar o Painél na Simualação pelo Banco de Dados
    public boolean verificaPainel(Paineis painel ) throws Exception{
        String sql="SELECT*FROM tb_paineis WHERE modelo = ? AND descricao = ? AND preco = ? AND link = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, painel.getModelo());
            ps.setString(2, painel.getDescricao());
            ps.setDouble(3, painel.getPreco());
            ps.setString(4, painel.getLink());
            
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    //Aqui foi criado o metodo para cadastrar o Painél pelo CRUD no Banco de Dados
    public void cadastrarPainel(Paineis painel) throws Exception {
        String sql="INSERT INTO tb_paineis(modelo,descricao,preco,potencia,link) values(?,?,?,?,?)";
         try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, painel.getModelo());
            ps.setString(2, painel.getDescricao());
            ps.setDouble(3, painel.getPreco());
            ps.setDouble(4, painel.getPotencia());
            ps.setString(5, painel.getLink());
            
            ps.execute();
        }
        
    }
    
    //Aqui foi criado o metodo para atualizar o Painél pelo CRUD no Banco de Dados
    public void atualizarPainel(Paineis painel) throws Exception {
        String sql="UPDATE tb_paineis SET modelo = ?, descricao = ?, preco = ?, potencia = ?, link = ?  WHERE Id_paineis = ?";
         try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, painel.getModelo());
            ps.setString(2, painel.getDescricao());
            ps.setDouble(3, painel.getPreco());
            ps.setDouble(4, painel.getPotencia());
            ps.setString(5, painel.getLink());
            ps.setInt(6, painel.getId_paineis());
            ps.execute();
        }
        
    }
    
    //Aqui foi criado o metodo para deletar o Painél pelo CRUD no Banco de Dados
    public void deletarPainel(Paineis painel) throws Exception {
        String sql="DELETE FROM tb_paineis WHERE Id_paineis = ?";
         try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setInt(1, painel.getId_paineis());
            ps.execute();
        }
        
    }
    //criei esse metodo somente para buscar 1 link no banco e dados pela potencia que o usuario escolheu
    public Paineis buscarPorPotencia(double potencia) throws Exception {
    String sql = "SELECT * FROM tb_paineis WHERE potencia = ?";
    try (Connection conn = ConexaoBD.obtemConexao();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setDouble(1, potencia);
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Paineis painel = new Paineis();
                //esse sao os dados que o metodo ira buscar na tabela e nas colunas dela////
                painel.setId_paineis(rs.getInt("Id_paineis"));
                painel.setModelo(rs.getString("modelo"));
                painel.setDescricao(rs.getString("descricao"));
                painel.setPreco(rs.getDouble("preco"));
                painel.setPotencia(rs.getDouble("potencia"));
                painel.setLink(rs.getString("link"));
                return painel;
            } else {
                return null;
            }
        }
    }
}
    
    
}
