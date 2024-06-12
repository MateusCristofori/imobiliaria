package com.principal.api.model.DTO;

import java.math.BigDecimal;

public record ClienteDTO(String nome, String data_nascimento, BigDecimal salario, String cpf, String email, String senha) {}
