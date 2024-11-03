package BancoDeDados;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarBank {
    public void delete(int codigo)throws SQLException {
        ConectBank conexao = new ConectBank();
        PreparedStatement pst = conexao.getConexao().prepareStatement(
                "delete from vehicles " + "where (codigo = ?)"
        );
        pst.setInt(1, codigo);
        pst.executeUpdate();
        pst.close();
        conexao.close();
    }
}
