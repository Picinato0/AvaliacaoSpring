package com.avaliacaospringboot.projetoSpringboot.dto;

import com.avaliacaospringboot.projetoSpringboot.entities.Client;

import java.io.Serializable;

public class ClientDTO implements Serializable {

    private Long id;
    private String name;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
