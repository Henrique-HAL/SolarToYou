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
    public boolean verificaPainel(Paineis painel ) throws Exception{
        String sql="SELECT*FROM tb_PaineisSolares WHERE modelo = ? , preco = ? , tipo_eficiencia = ?"
                + " eficiencia = ? AND potencia_maxima = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, painel.getModelo());
            ps.setDouble(2, painel.getPreco());
            ps.setString(3, painel.getTipo_eficiencia());
            ps.setInt(4, painel.getEficiencia());
            ps.setInt(5, painel.getPotencia_maxima());
            
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    
}
