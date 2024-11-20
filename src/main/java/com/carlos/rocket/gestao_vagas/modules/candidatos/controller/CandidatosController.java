package com.carlos.rocket.gestao_vagas.modules.candidatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.rocket.gestao_vagas.exceptions.UsuarioFoundException;
import com.carlos.rocket.gestao_vagas.modules.candidatos.CandidatoRepository;
import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;
import com.carlos.rocket.gestao_vagas.modules.candidatos.Service.CreateCandidatosUsuarioCase;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidato")
public class CandidatosController {

  
    @Autowired
    private CreateCandidatosUsuarioCase createCandidatosUsuarioCase;

    @PostMapping("/") 
    public ResponseEntity <Object> create(@Valid @RequestBody CandidatosEntities candidatosEntities) {
       try {
            var result =  this.createCandidatosUsuarioCase.execute(candidatosEntities);
            return ResponseEntity.ok().body(result);
       }catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
       }
    }
}

