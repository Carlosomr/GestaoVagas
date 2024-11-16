package com.carlos.rocket.gestao_vagas.modules.candidatos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.rocket.gestao_vagas.modules.candidatos.Entity.CandidatosEntities;

public interface CandidatoRepository extends JpaRepository<CandidatosEntities, UUID> {
    
}
