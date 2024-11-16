package com.carlos.rocket.gestao_vagas.modules.candidatos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidato")
public class CandidatosController {
    @PostMapping("/") 
    public void create(@Valid @RequestBody CandidatosEntities candidatosEntities) {
        System.out.println("Candidato");
        System.out.println(candidatosEntities.getNome());
        System.out.println(candidatosEntities.getUsuario());
        System.out.println(candidatosEntities.getEmail());
        System.out.println(candidatosEntities.getSenha());
        System.out.println(candidatosEntities.getDescricao());
        System.out.println(candidatosEntities.getCurriculo());
        
    }
}
