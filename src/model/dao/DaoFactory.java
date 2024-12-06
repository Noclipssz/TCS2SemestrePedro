package model.dao;

import BancoDeDados.ConectBank;
import model.dao.impl.CarDaoJDBC;
import model.dao.impl.ClienteDaoJDBC;
import model.dao.impl.FranquiaDaoJDBC;
import model.dao.impl.FuncionarioJDBC;

public class DaoFactory {
    public static CarDao createCarDao() {
        return new CarDaoJDBC(ConectBank.getConexao());
    }

    public static ClienteDao createClienteDao() {
        return new ClienteDaoJDBC(ConectBank.getConexao());
    }

    public static FuncionarioDao createFuncionarioDao() {
        return  new FuncionarioJDBC(ConectBank.getConexao());
    }
    public static FranquiaDao createFranquiaDao() {
        return  new FranquiaDaoJDBC(ConectBank.getConexao());
    }
}
