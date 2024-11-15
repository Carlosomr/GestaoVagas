package com.carlos.rocket.gestao_vagas.modules.candidatos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;

@RestController
@RequestMapping("/candidato")
public class CandidatosController {
    @PostMapping("/") 
    public void create(@RequestBody CandidatosEntities candidatosEntities) {
        System.out.println("Candidato");
        System.out.println(candidatosEntities.getNome());
        System.out.println(candidatosEntities.getEmail());
        
    }
}
