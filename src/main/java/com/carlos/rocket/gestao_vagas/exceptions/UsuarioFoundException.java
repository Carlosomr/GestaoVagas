package com.carlos.rocket.gestao_vagas.exceptions;

public class UsuarioFoundException extends RuntimeException{
    public UsuarioFoundException(){
        super("Usuario ja existe");
    }
}
