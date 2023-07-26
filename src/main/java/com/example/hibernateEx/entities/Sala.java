package com.example.hibernateEx.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    @ManyToOne
    private Sede sede;

}
