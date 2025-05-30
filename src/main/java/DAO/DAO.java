/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.solartoyour.ConexaoBD;
import com.mycompany.solartoyour.Usuario;
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
        String sql= "SELECT*FROM tb_usuarios WHERE (nome = ? OR email = ?), senha = ? AND is_admin = ?"; //Vai verificar nome ou email no Banco de dados//
        try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome()); //Pode ser o Nome 
            ps.setString(2, usuario.getEmail());// Ou pode ser O email para validar login
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getIs_admin());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
            
        }
    }
    //Aqui foi criado o metodo para cadastrar o usuario no Banco de Dados
    public void cadastrar (Usuario usuario) throws Exception{
        String sql= "INSERT INTO tb_usuarios(nome,email,senha,is_admin) values(?,?,?,?)";
        try(Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getIs_admin());
            ps.execute();
        }
        
    }
    
    
    
    
    
    //tetste
    
}
