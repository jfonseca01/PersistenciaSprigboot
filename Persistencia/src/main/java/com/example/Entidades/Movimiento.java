package com.example.Entidades;


import javax.persistence.*;

@Entity
public class Movimiento {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Integer monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;
    public Movimiento(){

    }
}
