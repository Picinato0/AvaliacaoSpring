package com.avaliacaospringboot.projetoSpringboot.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Task() {
    }

    public Task(Long id, String taskName, LocalDate date, Client client) {
        this.id = id;
        this.taskName = taskName;
        this.date = date;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
