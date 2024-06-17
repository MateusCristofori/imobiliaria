package com.principal.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.principal.api.model.DTO.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String data_nascimento;

    private BigDecimal salario;

    @NotBlank
    private String cpf;

    @NotBlank
    private String email;

    @NotBlank
//    @JsonIgnore
    private String senha;

    public Cliente(Long id, String nome, String data_nascimento, String cpf, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Cliente(ClienteDTO dto) {
        this.nome = dto.nome();
        this.data_nascimento = dto.data_nascimento();
        this.cpf = dto.cpf();
        this.email = dto.email();
        this.senha = dto.senha();
        this.salario = dto.salario();
    }
}