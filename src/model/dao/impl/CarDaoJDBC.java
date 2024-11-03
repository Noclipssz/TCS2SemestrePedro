package model.dao.impl;

import BancoDeDados.ConectBank;
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

    }

    @Override
    public void update(Car car) {

    }

    @Override
    public void deleteById(Car car) {

    }

    @Override
    public Car findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * from vehicles where id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Car car = instaciarCar(rs);
                return car;
            }
            return null;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            ConectBank.closeResult(rs);
            ConectBank.closeStatmente(st);
        }

    }

    private Car instaciarCar(ResultSet rs) throws SQLException {
        Car car = new Car();
        car.setId(rs.getInt("id"));
        car.setMake(rs.getString("make"));
        car.setModel(rs.getString("model"));
        car.setYear(rs.getInt("year"));
        car.setColor(rs.getString("color"));
        car.setMileage(rs.getDouble("mileage"));
        car.setPrice(rs.getDouble("price"));
        return car;
    }

    @Override
    public List<Car> FindAll() {
        List<Car> cars = new ArrayList<>();
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * from vehicles");
            rs = st.executeQuery();
            while (rs.next()) {
                cars.add(instaciarCar(rs));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            ConectBank.closeResult(rs);
            ConectBank.closeStatmente(st);
        }
        return cars;
    }
}
