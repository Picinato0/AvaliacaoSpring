package com.avaliacaospringboot.projetoSpringboot.controllers;

import com.avaliacaospringboot.projetoSpringboot.dto.ClientDTO;
import com.avaliacaospringboot.projetoSpringboot.entities.Client;
import com.avaliacaospringboot.projetoSpringboot.repositories.ClientRepository;
import com.avaliacaospringboot.projetoSpringboot.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll() {
        List<ClientDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public Client registerClient(@RequestBody Client client) {
        return repository.save(client);
    }
}
