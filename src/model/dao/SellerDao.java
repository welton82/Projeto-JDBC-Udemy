package model.dao;

import model.entity.Department;
import model.entity.Seller;

import java.util.List;

public interface SellerDao {

    void insere(Seller obj);
    void alterar(Seller obj);
    void deletarPorId(Integer id);
    Department consultar(Integer id);
    List<Seller> listar();
}
