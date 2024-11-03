package BancoDeDados;

import java.sql.*;
import javax.swing.JOptionPane;


public class ConectBank {
    // criar variável conexao
    public Connection connection;
//driver, DRIVER = banco de dados, URL referente ao caminho

    public Connection getConexao() {
        final String DRIVER = "com.mysql.cj.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/carsistem";
        // tenta a conexao, root e root como usuário e senha
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(
                    URL,
                    "root",
                    "12345678"
            );
            return connection;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas na fonte de dados." + e.toString());
        }
        return null;
    }

    //fechar conexão
    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao fechar conexão" + e.toString());
        }

    }

    public void closeStatmente(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problemas ao fechar conexão" + e.toString());
            }
        }
    }

    public void closeResult(ResultSet st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problemas ao fechar conexão" + e.toString());
            }
        }
    }
}


