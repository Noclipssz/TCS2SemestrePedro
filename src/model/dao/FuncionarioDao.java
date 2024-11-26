package model.dao;
import model.entities.Funcionario;


public interface FuncionarioDao {
    void createFuncionario(Funcionario funcionario);
    Funcionario readFuncionario(int idFuncionario);
    void updateFuncionario(Funcionario funcionario);
    void deleteFuncionario(int idFuncionario);

}
