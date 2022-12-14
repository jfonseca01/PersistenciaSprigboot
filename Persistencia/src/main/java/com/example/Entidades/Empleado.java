package com.example.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Entity
public class Empleado{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id;
    private String name;
    private String email;

    @OneToMany(mappedBy="empleado")
    private List<Movimiento> movimientoList;

    //AGREGO ESTE COMENTARIO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Empleado(){

    }
    //AGREGO TO STRING
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", movimientoList=" + movimientoList +
                '}';
    }
}