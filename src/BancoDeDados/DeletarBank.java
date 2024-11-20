package BancoDeDados;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarBank {
    public void delete(int codigo)throws SQLException {
        PreparedStatement pst = ConectBank.getConexao().prepareStatement(
                "delete from vehicles " + "where (codigo = ?)"
        );
        pst.setInt(1, codigo);
        pst.executeUpdate();
        pst.close();
        ConectBank.close();
    }
}
