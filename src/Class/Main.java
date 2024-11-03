package Class;
import model.dao.CarDao;
import model.dao.DaoFactory;
import model.entities.Car;

public class Main {
    public static void main(String[] args) {
        CarDao car = DaoFactory.createCarDao();
        Car car1 = car.findById(9);
        System.out.println(car1);


    }
}