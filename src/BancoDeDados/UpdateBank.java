package BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBank {
    public void insert(String model) {
        ConectBank conexao = new ConectBank();
        Connection con = null;
        PreparedStatement ps = null;
        int a = 0;
        try {
            con = conexao.getConexao();
            con.setAutoCommit(false);
            ps = con.prepareStatement(
                    "UPDATE vehicles SET model = ? WHERE id = 9");
            ps.setString(1, model);
            a = ps.executeUpdate();
            int i = 1;
            if (i < 2) {
//                throw new SQLException("errror"); //simulação de falha
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            conexao.closeStatmente(ps);
            conexao.close();
            System.out.println(a);
        }


    }
}
