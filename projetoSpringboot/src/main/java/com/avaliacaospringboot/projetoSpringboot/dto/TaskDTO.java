package com.avaliacaospringboot.projetoSpringboot.dto;

import com.avaliacaospringboot.projetoSpringboot.entities.Task;

import java.time.LocalDate;

public class TaskDTO {

    private Long id;
    private String taskName;
    private LocalDate date;

    private ClientDTO client;

    public TaskDTO(){
    }

    public TaskDTO(Long id, String taskName, LocalDate date, ClientDTO client) {
        this.id = id;
        this.taskName = taskName;
        this.date = date;
        this.client = client;
    }

    public TaskDTO(Task entity) {
        id = entity.getId();
        taskName = entity.getTaskName();
        date = entity.getDate();
        client = new ClientDTO(entity.getClient());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

}
