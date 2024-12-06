package model.dao;
import model.entities.Car;
import java.util.List;

public interface CarDao {
    void inserir(Car car);
    void update(Car car);
    void deleteById(Integer i);
    Car findById(Integer id);
    List<Car> findAll();


}
