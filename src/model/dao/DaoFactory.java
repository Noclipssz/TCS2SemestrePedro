package model.dao;

import BancoDeDados.ConectBank;
import model.dao.impl.CarDaoJDBC;

public class DaoFactory {
    public static CarDao createCarDao() {
        return new CarDaoJDBC(ConectBank.getConexao());
    }
}
