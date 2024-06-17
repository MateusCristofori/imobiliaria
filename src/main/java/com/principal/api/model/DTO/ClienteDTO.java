package com.principal.api.model.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.principal.api.model.Cliente;

import java.math.BigDecimal;

public record ClienteDTO(String nome, String data_nascimento, BigDecimal salario, String cpf, String email, @JsonIgnore String senha) {

    public ClienteDTO(String nome, String data_nascimento, BigDecimal salario, String cpf, String email, String senha) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
}
