package com.avaliacaospringboot.projetoSpringboot.repositories;

import com.avaliacaospringboot.projetoSpringboot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
