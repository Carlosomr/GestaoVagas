package com.carlos.rocket.gestao_vagas.modules.candidatos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.rocket.gestao_vagas.exceptions.UsuarioFoundException;
import com.carlos.rocket.gestao_vagas.modules.candidatos.CandidatoRepository;
import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;

@Service
public class CreateCandidatosUsuarioCase {
  @Autowired
  private CandidatoRepository candidatoRepository;

  public CandidatosEntities execute (CandidatosEntities candidatosEntities){
        this.candidatoRepository
        .findByUsuarioOrEmail(candidatosEntities.getUsuario(), candidatosEntities.getEmail())
       .ifPresent((user) -> {
            throw new UsuarioFoundException();
       });
        return this.candidatoRepository.save(candidatosEntities);
    }
  
}
