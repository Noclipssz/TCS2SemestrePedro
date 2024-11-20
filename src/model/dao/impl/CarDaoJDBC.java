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
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, car.getValor());
            ps.setString(2, car.getCor());
            ps.setString(3, car.getModelo());
            ps.setInt(4, car.getAno());
            ps.setString(5, car.getMarca());
            ps.setString(6, car.getPlaca());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Car car) {
        String sql = "UPDATE carro SET modelo = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, car.getModelo());
            ps.setInt(2, car.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(Car car, Integer i) {
        String sql = "DELETE FROM carro WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, i);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Car findById(Integer id) {
        String sql = "SELECT * FROM carro WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return instaciarCar(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
                cars.add(instaciarCar(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cars;
    }

    private Car instaciarCar(ResultSet rs) throws SQLException {
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
}
