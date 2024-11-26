package model.dao;

import model.entities.Franquia;

import java.util.List;

public interface FranquiaDao {
    void inserir(Franquia franquia);
    void update(Franquia franquia);
    void deleteById(Integer id);
    Franquia findById(Integer id);
    List<Franquia> findAll();
}
