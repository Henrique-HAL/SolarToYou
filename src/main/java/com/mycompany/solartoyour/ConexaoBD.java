/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
   

    // Informações para conexão com Azure SQL Database
    // Substitua {sua_senha_aqui} pela senha real
    private static String connectionUrl = "jdbc:sqlserver://solartoyou.database.windows.net:1433;database=A3;user=Giovanni@solartoyou;password={São Judas1};encrypt=false;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

    public static Connection obtemConexao() {
        Connection connection = null;
        try {
            // Certifique-se de que o driver JDBC do SQL Server está no classpath
            // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Descomente se necessário carregar manualmente

            // Obter a conexão usando a URL completa
            System.out.println("Conexão com Azure SQL Database estabelecida com sucesso!");
            
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Conexão com Azure SQL Database estabelecida com sucesso!"); // Opcional: Log de sucesso
            return connection;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao Azure SQL Database: " + e.getMessage());
            // Imprime o stack trace para depuração
            return null;
        } /*catch (ClassNotFoundException e) { // Descomente se usar Class.forName
            System.err.println("Driver JDBC do SQL Server não encontrado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }*/
    }

    // Método principal para teste rápido (opcional)
    public static void main(String[] args) {
        Connection conn = obtemConexao();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}

