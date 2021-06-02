package com.avaliacaospringboot.projetoSpringboot.services;

import com.avaliacaospringboot.projetoSpringboot.dto.ClientDTO;
import com.avaliacaospringboot.projetoSpringboot.entities.Client;
import com.avaliacaospringboot.projetoSpringboot.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<ClientDTO> findAll() {
        List<Client> result = repository.findAll();
        return result.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }
}
