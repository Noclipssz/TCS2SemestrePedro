package model.dao;

import model.entities.Cliente;

import java.util.List;

public interface ClienteDao {
    void inserir(Cliente cliente);
    void update(Cliente cliente);
    void deleteById(Integer id);
    Cliente findById(Integer id);
    List<Cliente> findAll();
}
