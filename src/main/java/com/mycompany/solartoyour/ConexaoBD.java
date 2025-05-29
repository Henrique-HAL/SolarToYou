/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    //Aqui estarei colocando as Informacoes do meu Banco de Dados (Henrique)
    private static String host = "localhost";
    private static String porta = "3306";       
    private static String bd = "solar_toyouods";
    private static String usuario = "root";
    private static String senha =  "33461635Henrique";
    
    public static Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host +
                    ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC"
            ,usuario,senha);
            return c;
        }
        catch(SQLException e ){
            return null;
        }
    }
}

    

