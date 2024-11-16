package com.carlos.rocket.gestao_vagas.modules.candidatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.rocket.gestao_vagas.exceptions.UsuarioFoundException;
import com.carlos.rocket.gestao_vagas.modules.candidatos.CandidatoRepository;
import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidato")
public class CandidatosController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @PostMapping("/") 
    public CandidatosEntities create(@Valid @RequestBody CandidatosEntities candidatosEntities) {
        this.candidatoRepository
        .findByUsuarioOrEmail(candidatosEntities.getUsuario(), candidatosEntities.getEmail())
       .ifPresent((user) -> {
            throw new UsuarioFoundException();
       });
        return this.candidatoRepository.save(candidatosEntities);
    }
}

