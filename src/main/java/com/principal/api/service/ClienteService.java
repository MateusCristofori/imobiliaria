package com.principal.api.service;

import com.principal.api.model.Cliente;
import com.principal.api.model.DTO.ClienteDTO;
import com.principal.api.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public ClienteDTO create(ClienteDTO dto) {
        Cliente novo_cliente = new Cliente(dto);
        repository.save(novo_cliente);
        return modelMapper.map(novo_cliente, ClienteDTO.class);
    }
}
