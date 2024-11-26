package model.dao.impl;

import model.dao.FranquiaDao;
import model.entities.Franquia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FranquiaDaoJDBC implements FranquiaDao {
    private Connection conn;

    public FranquiaDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Franquia franquia) {
        String sql = "INSERT INTO franquia (cep, nome_dono, gerente, numero_funcionarios) VALUES (?, ?, ?, ?)";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, franquia.getCep());
                ps.setString(2, franquia.getNomeDono());
                ps.setString(3, franquia.getGerente());
                ps.setString(4, franquia.getNumeroFuncionarios());
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte transação em caso de erro
                throw new RuntimeException("Erro ao inserir franquia: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public void update(Franquia franquia) {
        String sql = "UPDATE franquia SET cep = ?, nome_dono = ?, gerente = ?, numero_funcionarios = ? WHERE id_franquia = ?";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, franquia.getCep());
                ps.setString(2, franquia.getNomeDono());
                ps.setString(3, franquia.getGerente());
                ps.setString(4, franquia.getNumeroFuncionarios());
                ps.setInt(5, franquia.getIdFranquia());
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte transação em caso de erro
                throw new RuntimeException("Erro ao atualizar franquia: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM franquia WHERE id_franquia = ?";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte transação em caso de erro
                throw new RuntimeException("Erro ao deletar franquia: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public Franquia findById(Integer id) {
        String sql = "SELECT * FROM franquia WHERE id_franquia = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return instanciarFranquia(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar franquia por ID: " + e.getMessage(), e);
        }
        return null;
    }

    @Override
    public List<Franquia> findAll() {
        String sql = "SELECT * FROM franquia";
        List<Franquia> franquias = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                franquias.add(instanciarFranquia(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar todas as franquias: " + e.getMessage(), e);
        }
        return franquias;
    }

    private Franquia instanciarFranquia(ResultSet rs) throws SQLException {
        Franquia franquia = new Franquia();
        franquia.setIdFranquia(rs.getInt("id_franquia"));
        franquia.setCep(rs.getString("cep"));

        franquia.setNomeDono(rs.getString("nome_dono"));
        franquia.setGerente(rs.getString("gerente"));
        franquia.setNumeroFuncionarios(rs.getString("numero_funcionarios"));
        return franquia;
    }

    private void resetAutoCommit() {
        try {
            conn.setAutoCommit(true); // Volta ao modo padrão
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao redefinir autocommit: " + e.getMessage(), e);
        }
    }
}
