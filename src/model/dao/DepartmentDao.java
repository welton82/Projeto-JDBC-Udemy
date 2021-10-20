package model.dao;

import model.entity.Department;

import java.util.List;

public interface DepartmentDao {

    void insere(Department obj);
    void alterar(Department obj);
    void deletarPorId(Integer id);
    Department consultar(Integer id);
    List<Department> listar();
}
