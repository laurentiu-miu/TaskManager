package com.example.taskmanager.restrepo;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task,Integer> {

    List<Task> findAllByNameLike(@Param("nameLike") String nameLike);
}
