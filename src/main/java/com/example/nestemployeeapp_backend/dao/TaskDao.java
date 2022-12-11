package com.example.nestemployeeapp_backend.dao;

import com.example.nestemployeeapp_backend.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task,Integer> {
}
