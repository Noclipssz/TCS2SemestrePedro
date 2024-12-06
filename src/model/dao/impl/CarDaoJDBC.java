package model.dao.impl;

import model.dao.CarDao;
import model.entities.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDaoJDBC implements CarDao {
    private Connection conn;

    public CarDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Car car) {
        String sql = "INSERT INTO carro (valor, cor, modelo, ano, marca, placa) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, car.getValor());
                ps.setString(2, car.getCor());
                ps.setString(3, car.getModelo());
                ps.setInt(4, car.getAno());
                ps.setString(5, car.getMarca());
                ps.setString(6, car.getPlaca());
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte alterações em caso de erro
                throw new RuntimeException("Erro ao inserir carro: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public void update(Car car) {
        String sql = "UPDATE carro SET modelo = ?, cor = ?, valor = ?, ano = ?, marca = ?, placa = ? WHERE id = ?";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, car.getModelo());
                ps.setString(2, car.getCor());
                ps.setString(3, car.getValor());
                ps.setInt(4, car.getAno());
                ps.setString(5, car.getMarca());
                ps.setString(6, car.getPlaca());
                ps.setInt(7, car.getId());
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte alterações em caso de erro
                throw new RuntimeException("Erro ao atualizar carro: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM carro WHERE id = ?";
        try {
            conn.setAutoCommit(false); // Inicia transação
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.commit(); // Confirma transação
            } catch (SQLException e) {
                conn.rollback(); // Reverte alterações em caso de erro
                throw new RuntimeException("Erro ao deletar carro: " + e.getMessage(), e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao configurar transação: " + e.getMessage(), e);
        } finally {
            resetAutoCommit();
        }
    }

    @Override
    public Car findById(Integer id) {
        String sql = "SELECT * FROM carro WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return instanciarCar(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar carro por ID: " + e.getMessage(), e);
        }
        return null;
    }

    @Override
        public List<Car> findAll() {
            List<Car> cars = new ArrayList<>();
            String sql = "SELECT * FROM carro";
            try (PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    cars.add(instanciarCar(rs));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao buscar todos os carros: " + e.getMessage(), e);
            }
            return cars;
        }

    private Car instanciarCar(ResultSet rs) throws SQLException {
        Car car = new Car();
        car.setId(rs.getInt("id"));
        car.setValor(rs.getString("valor"));
        car.setCor(rs.getString("cor"));
        car.setModelo(rs.getString("modelo"));
        car.setAno(rs.getInt("ano"));
        car.setMarca(rs.getString("marca"));
        car.setPlaca(rs.getString("placa"));
        return car;
    }

    private void resetAutoCommit() {
        try {
            conn.setAutoCommit(true); // Volta ao modo padrão
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao redefinir autocommit: " + e.getMessage(), e);
        }
    }
}
