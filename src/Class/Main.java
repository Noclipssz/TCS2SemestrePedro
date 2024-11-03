package Class;
import model.dao.CarDao;
import model.dao.DaoFactory;
import model.entities.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDao car = DaoFactory.createCarDao();
        Car car1 = car.findById(9);
        System.out.println(car1);

        List<Car> List = car.FindAll();
        for (Car car2 : List) {
            System.out.println(car2);
        }


    }
}