package BancoDeDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBank {
    public void insert(String make, String model, int year, String color, double mileage, double price) {
        ConectBank conexao = new ConectBank();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexao.getConexao();
            ps = con.prepareStatement(
                    "insert into vehicles (make, model, year, color, mileage, price) values (?, ?, ?, ?, ?, ?)");
            ps.setString(1, make);
            ps.setString(2, model);
            ps.setInt(3, year);
            ps.setString(4, color);
            ps.setDouble(5, mileage);
            ps.setDouble(6, price);

            int rowaffects = ps.executeUpdate();
            System.out.println(rowaffects);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            conexao.closeStatmente(ps);
            conexao.close();
        }
    }
}
