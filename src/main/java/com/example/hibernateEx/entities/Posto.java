package com.example.hibernateEx.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
@Check(constraints = "fila > 0")
@Check(constraints = "numero > 0")
public class Posto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int fila;
    @Column(nullable = false)
    private int numero;

}
