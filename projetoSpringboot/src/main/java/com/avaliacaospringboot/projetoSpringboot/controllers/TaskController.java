package com.avaliacaospringboot.projetoSpringboot.controllers;

import com.avaliacaospringboot.projetoSpringboot.dto.ClientDTO;
import com.avaliacaospringboot.projetoSpringboot.dto.TaskDTO;
import com.avaliacaospringboot.projetoSpringboot.entities.Client;
import com.avaliacaospringboot.projetoSpringboot.entities.Task;
import com.avaliacaospringboot.projetoSpringboot.repositories.ClientRepository;
import com.avaliacaospringboot.projetoSpringboot.repositories.TaskRepository;
import com.avaliacaospringboot.projetoSpringboot.services.ClientService;
import com.avaliacaospringboot.projetoSpringboot.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @Autowired
    private TaskRepository repository;

    @GetMapping
    public ResponseEntity<List<TaskDTO>> findAll() {
        List<TaskDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public Task registerClient(@RequestBody Task task) {
        return repository.save(task);
    }
}
