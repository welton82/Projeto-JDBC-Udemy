package model.entity;

import java.io.Serializable;
import java.util.Objects;

public class Departmen implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Departmen() {
    }

    public Departmen(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departmen)) return false;
        Departmen departmen = (Departmen) o;
        return getId().equals(departmen.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {


        return "Departmen{id= " + id + ", name= " + name + '}';
    }
}
