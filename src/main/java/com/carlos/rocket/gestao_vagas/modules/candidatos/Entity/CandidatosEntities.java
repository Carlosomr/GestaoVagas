package com.carlos.rocket.gestao_vagas.modules.candidatos.Entity;

import java.util.UUID;

import lombok.Data;
@Data
public class CandidatosEntities {
    private UUID id;
    private String nome;
    private String usuario;
    private String email;
    private String senha;
    private String descricao;
    private String curriculo;
}
