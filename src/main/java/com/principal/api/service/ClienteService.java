package com.principal.api.service;

import com.principal.api.model.Cliente;
import com.principal.api.model.DTO.ClienteDTO;
import com.principal.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente create(ClienteDTO dto) {
        Cliente novo_cliente = new Cliente(dto);
        repository.save(novo_cliente);
        return null;
    }
}
