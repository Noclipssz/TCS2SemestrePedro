package model.dao;
import model.entities.Funcionario;

import java.util.List;


public interface FuncionarioDao {
    void createFuncionario(Funcionario funcionario);
    Funcionario readFuncionario(int idFuncionario);
    void updateFuncionario(Funcionario funcionario);
    void deleteFuncionario(int idFuncionario);
     List<Funcionario> findAll();
}
