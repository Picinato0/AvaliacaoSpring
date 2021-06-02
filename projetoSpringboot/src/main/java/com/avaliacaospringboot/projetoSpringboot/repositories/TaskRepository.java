package com.avaliacaospringboot.projetoSpringboot.repositories;

import com.avaliacaospringboot.projetoSpringboot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
