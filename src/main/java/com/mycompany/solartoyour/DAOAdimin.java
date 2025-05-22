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
public class DAOAdimin {
    //Aqui sera criado o metodo que verifica se o Administrador esta cadastrado no Banco de Dados//
    public boolean existeAdmin(Administrador administrador ) throws Exception{
        String sql="SELECT*FROM tb_Admins WHERE nome = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, administrador.getNome());
            ps.setString(2, administrador.getSenha());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
