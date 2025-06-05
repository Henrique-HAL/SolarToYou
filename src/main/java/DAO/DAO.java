/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mycompany.solartoyour.ConexaoBD;
import com.mycompany.solartoyour.Usuario;

/**
 *
 * @author Henri
 */
public class DAO {

    //Aqui e criado o metodo para ser chamado no BottonLogin da tela Login
    public boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT*FROM tb_usuario WHERE (nome = ? OR email = ?) AND senha = ? AND is_admin = ?"; //Vai verificar nome ou email no Banco de dados//
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome()); //Pode ser o Nome 
            ps.setString(2, usuario.getEmail());// Ou pode ser O email para validar login
            ps.setString(3, usuario.getSenha());
            ps.setBoolean(4, usuario.getIs_admin());

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        }
    }

    //Aqui foi criado o metodo para cadastrar o usuario no Banco de Dados
    public void cadastrar(Usuario usuario) throws Exception {
        String sql = "INSERT INTO tb_usuario(nome,email,senha) values(?,?,?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.execute();
        }
    }

    //verifica se o usuario é um adm ou não, retorna um boolean
    public boolean admin(Usuario usuario) throws Exception {
        String sql = "SELECT*FROM tb_usuario WHERE (nome = ? OR email = ?) AND is_admin > 0";
        try(Connection con = ConexaoBD.obtemConexao(); PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ResultSet rs = ps.executeQuery();
            int is_admin = 0;

            while (rs.next()){
            is_admin = rs.getInt("is_admin");
            }

            return is_admin > 0;
        }
    }
    
    //Aqui foi criado o metodo para atualizar o perfil do usuario no Banco de Dados
    public void atualizarPerfil(Usuario usuario) throws Exception {
        String sql="UPDATE tb_usuario SET nome = ?, email = ?, senha = ?, WHERE id_usuario = ?";
         try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setInt(4, usuario.getId_usuario());
            ps.execute();
        }
        
    }
    
    //Aqui foi criado o metodo para deletar o perfil do usuario no Banco de Dados
    public void deletarPerfil(Usuario usuario) throws Exception {
        String sql="DELETE FROM tb_usuario WHERE nome = ? AND senha = ?";
         try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.execute();
        }
        
    }
    
    
    
    
    
    //tetste
    
}
