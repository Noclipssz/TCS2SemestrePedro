package model.dao;

import model.entities.Car;

import java.util.List;

public interface CarDao {
    void inserir(Car car);
    void update(Car car);
    Car deleteById(Integer id);
    List<Car> FindAll();
}
