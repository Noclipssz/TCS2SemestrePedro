package model.dao.impl;

import BancoDeDados.ConectBank;
import model.dao.CarDao;
import model.dao.FuncionarioDao;
import model.entities.Funcionario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioJDBC implements FuncionarioDao {
    private Connection conn;

    public FuncionarioJDBC(Connection conn) {
        this.conn = conn;
    }

    public void createFuncionario(Funcionario funcionario) {
        String sqlInsert = "INSERT INTO funcionario (nome, cpf, email, cep, idade, data_nasc, cargo) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Conectando ao banco
            conn = ConectBank.getConexao();
            conn.setAutoCommit(false); // Iniciando transação

            // Preparando o statement
            stmt = conn.prepareStatement(sqlInsert);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getEmail());
            stmt.setString(4, funcionario.getCep());
            stmt.setInt(5, funcionario.getIdade());
            stmt.setInt(6, funcionario.getDataNascimento()); // Exemplo de data como inteiro
            stmt.setString(7, funcionario.getCargo());

// Executando o INSERT
            stmt.executeUpdate();

// Simular erro para teste (descomente para forçar rollback)
            // int testeErro = 1 / 0;

// Confirmar a transação
            conn.commit();
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
            try {
                if (conn != null) {
                    conn.rollback(); // Rollback em caso de erro
                    System.out.println("Transação revertida.");
                }
            } catch (SQLException rollbackEx) {
                System.err.println("Erro ao reverter transação: " + rollbackEx.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Transação revertida.");
                }
            } catch (SQLException rollbackEx) {
                System.err.println("Erro ao reverter transação: " + rollbackEx.getMessage());
            }
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException closeEx) {
                System.err.println("Erro ao fechar recursos: " + closeEx.getMessage());
            }
        }
    }



public Funcionario readFuncionario(int idFuncionario) {
    String sql = "SELECT * FROM funcionario WHERE id_funcionario = ?";
    Funcionario funcionario = null;

    try (Connection conn = ConectBank.getConexao();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, idFuncionario);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            funcionario = new Funcionario();
            funcionario.setIdFuncionario(rs.getInt("id_funcionario"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setEmail(rs.getString("email"));
            funcionario.setIdade(rs.getInt("idade"));
            funcionario.setDataNascimento(rs.getInt("data_nasc"));
            funcionario.setCargo(rs.getString("cargo"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return funcionario;
}

public void updateFuncionario(Funcionario funcionario) {
    String sql = "UPDATE funcionario SET nome = ?, cpf = ?, email = ?, idade = ?, data_nascimento = ?, cargo = ? WHERE id_funcionario = ?";
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = ConectBank.getConexao();
        conn.setAutoCommit(false); // Inicia a transação

        stmt = conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getNome());
        stmt.setString(2, funcionario.getCpf());
        stmt.setString(3, funcionario.getEmail());
        stmt.setInt(4, funcionario.getIdade());
        stmt.setDate(5, Date.valueOf(funcionario.getDataNascimento().toString())); // Corrigir tipo
        stmt.setString(6, funcionario.getCargo());
        stmt.setInt(7, funcionario.getIdFuncionario());
        stmt.executeUpdate();

        conn.commit(); // Confirma a transação
    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback(); // Reverte a transação em caso de erro
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.setAutoCommit(true); // Restaura o comportamento padrão
            if (conn != null) conn.close();
        } catch (SQLException closeEx) {
            closeEx.printStackTrace();
        }
    }
}

public void deleteFuncionario(int idFuncionario) {
    String sql = "DELETE FROM funcionario WHERE id = ?";
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = ConectBank.getConexao();
        conn.setAutoCommit(false); // Inicia a transação

        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idFuncionario);
        stmt.executeUpdate();

        conn.commit(); // Confirma a transação
    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback(); // Reverte a transação em caso de erro
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        }
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.setAutoCommit(true); // Restaura o comportamento padrão
            if (conn != null) conn.close();
        } catch (SQLException closeEx) {
            closeEx.printStackTrace();
        }
    }
}
    public List<Funcionario> findAll() {
        String sql = "SELECT * FROM funcionario";
        List<Funcionario> funcionarios = new ArrayList<>();

        try (Connection conn = ConectBank.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setDataNascimento(rs.getInt("data_nasc"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }



}

