/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Henri
 */
public class DAO {
    //Aqui e criado o metodo para ser chamado no BottonLogin da tela Login
    public boolean existe(Usuario usuario) throws Exception{
        String sql= "SELECT*FROM tb_Usuarios WHERE (nome = ? OR email = ?) AND senha = ?"; //Vai verificar nome ou email no Banco de dados//
        try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome()); //Pode ser o Nome 
            ps.setString(2, usuario.getEmail());// Ou pode ser O email para validar login
            ps.setString(3, usuario.getSenha());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
            
        }
    }
    
    public void cadastrar (Usuario usuario) throws Exception{
        String sql= "INSERT INTO tb_Usuarios(nome,email,senha) values(?,?,?)";
        try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.execute();
        }
        
    }
    
    
    
    
    
    //tetste
    
}
