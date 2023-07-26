package com.example.hibernateEx.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;

@Entity
@Table
@Check(constraints = "prezzo >= 0")
@Check(constraints = "durata > 0")
public class Spettacolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private LocalDateTime dataOra;
    @Column(nullable = false)
    private String genere;
    @Column
    private int durata;
    @Column(nullable = false)
    private double prezzo;
    @ManyToOne
    private Sala sala;

}
