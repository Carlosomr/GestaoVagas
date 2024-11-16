package com.carlos.rocket.gestao_vagas.modules.candidatos.Entity;

import java.util.UUID;
import java.time.LocalDateTime;   
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidatosEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;

    @Pattern(regexp = "^[^\\s]+$", message = "o campo [usuario] nao deve conter espaço")
    private String usuario;

    @Email(message = "O campo [email] deve conter um email valido")
    private String email;

    @Length(min = 10, max = 100)
    private String senha;
    private String descricao;
    private String curriculo;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
