package model.dao.impl;

import model.dao.CarDao;
import model.entities.Car;

import java.util.List;

public class CarDaoJDBC implements CarDao {


    @Override
    public void inserir(Car car) {

    }

    @Override
    public void update(Car car) {

    }

    @Override
    public Car deleteById(Integer id) {
        return null;
    }

    @Override
    public List<Car> FindAll() {
        return List.of();
    }
}
