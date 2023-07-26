package com.example.hibernateEx.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String indirizzo;
    @Column(nullable = false)
    private String comune;


}
