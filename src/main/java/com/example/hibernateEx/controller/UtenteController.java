package com.example.hibernateEx.controller;

import com.example.hibernateEx.entities.Utente;
import com.example.hibernateEx.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    @PostMapping("/create")
    public void createUtente(@RequestBody Utente utente) {
        utenteRepository.saveAndFlush(utente);
    }

    @GetMapping("/get")
    public Utente getUtenteById(@RequestParam long id) {
        Optional<Utente> optionalUtente = utenteRepository.findById(id);
        if (optionalUtente.isEmpty()) throw new IllegalArgumentException("Utente non trovato");
        return optionalUtente.get();
    }

    @GetMapping("/getall")
    public List<Utente> getAll() {
        return utenteRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        utenteRepository.deleteById(id);
    }

    @DeleteMapping("/deleteall")
    public void deleteAll() {
        utenteRepository.deleteAll();
    }

    @PutMapping("/updatemail")
    public void updateEmail(@RequestParam long id, @RequestParam String email) {
        Optional<Utente> optionalUtente = utenteRepository.findById(id);
        if (optionalUtente.isEmpty()) throw new IllegalArgumentException("Utente non trovato");
        Utente u = optionalUtente.get();
        u.setEmail(email);
        utenteRepository.saveAndFlush(u);
    }

}
