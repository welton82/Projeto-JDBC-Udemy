package application;

import connection.Conexao;
import model.entity.Departmen;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        //Connection cnn = Conexao.getConnection();
        Departmen obj = new Departmen(1, "books");
        System.out.println(obj);
    }
}
