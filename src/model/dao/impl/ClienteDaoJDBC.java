package model.dao.impl;

import model.dao.ClienteDao;
import model.entities.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoJDBC implements ClienteDao {
    private Connection conn;

    public ClienteDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, cep, email, idade, data_nasc) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn.setAutoCommit(false); // Inicia a transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setString(3, cliente.getCep());
                ps.setString(4, cliente.getEmail()); // Adiciona o campo de email
                ps.setInt(5, cliente.getIdade());
                ps.setInt(6, cliente.getDataNascimento()); // Mantém o campo data_nasc como int
                ps.executeUpdate();
                conn.commit(); // Confirma a transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte a transação em caso de erro
                throw new RuntimeException("Erro ao inserir cliente: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            try {
                conn.setAutoCommit(true); // Volta ao modo padrão
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao redefinir autocommit: " + e.getMessage(), e);
            }
        }
    }

    @Override
    public void update(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, cep = ?, email = ?, idade = ?, data_nasc = ? WHERE id = ?";
        try {
            conn.setAutoCommit(false); // Inicia a transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setString(3, cliente.getCep());
                ps.setString(4, cliente.getEmail()); // Adiciona o campo de email
                ps.setInt(5, cliente.getIdade());
                ps.setInt(6, cliente.getDataNascimento()); // Mantém o campo data_nasc como int
                ps.setInt(7, cliente.getId());
                ps.executeUpdate();
                conn.commit(); // Confirma a transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte a transação em caso de erro
                throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            try {
                conn.setAutoCommit(true); // Volta ao modo padrão
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao redefinir autocommit: " + e.getMessage(), e);
            }
        }
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        try {
            conn.setAutoCommit(false); // Inicia a transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.commit(); // Confirma a transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte a transação em caso de erro
                throw new RuntimeException("Erro ao deletar cliente: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            try {
                conn.setAutoCommit(true); // Volta ao modo padrão
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao redefinir autocommit: " + e.getMessage(), e);
            }
        }
    }

    @Override
    public Cliente findById(Integer id) {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return instanciarCliente(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar cliente por ID: " + e.getMessage(), e);
        }
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                clientes.add(instanciarCliente(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar todos os clientes: " + e.getMessage(), e);
        }
        return clientes;
    }

    private Cliente instanciarCliente(ResultSet rs) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(rs.getInt("id"));
        cliente.setNome(rs.getString("nome"));
        cliente.setCpf(rs.getString("cpf"));
        cliente.setCep(rs.getString("cep"));
        cliente.setEmail(rs.getString("email")); // Inclui o email
        cliente.setIdade(rs.getInt("idade"));
        cliente.setDataNascimento(rs.getInt("data_nasc")); // Mantém como int
        return cliente;
    }
}
