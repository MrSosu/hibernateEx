package com.example.hibernateEx.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private LocalDateTime timestamp;
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Spettacolo spettacolo;
    @ManyToOne
    private Posto posto;

}
