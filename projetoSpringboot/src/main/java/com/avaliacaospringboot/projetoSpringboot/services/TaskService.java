package com.avaliacaospringboot.projetoSpringboot.services;

import com.avaliacaospringboot.projetoSpringboot.dto.ClientDTO;
import com.avaliacaospringboot.projetoSpringboot.dto.TaskDTO;
import com.avaliacaospringboot.projetoSpringboot.entities.Client;
import com.avaliacaospringboot.projetoSpringboot.entities.Task;
import com.avaliacaospringboot.projetoSpringboot.repositories.ClientRepository;
import com.avaliacaospringboot.projetoSpringboot.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<TaskDTO> findAll() {
        List<Task> result = repository.findAll();
        return result.stream().map(x -> new TaskDTO(x)).collect(Collectors.toList());
    }
}
