package com.principal.api.controller;

import com.principal.api.model.Cliente;
import com.principal.api.model.DTO.ClienteDTO;
import com.principal.api.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping()
    public ResponseEntity<Cliente> create(@RequestBody @Valid ClienteDTO dto) {

        return null;
    }
}
