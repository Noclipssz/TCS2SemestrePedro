package model.dao;

import model.dao.impl.CarDaoJDBC;

public class DaoFactory {
    public CarDao createCarDao() {
        return new CarDaoJDBC();
    }
}
