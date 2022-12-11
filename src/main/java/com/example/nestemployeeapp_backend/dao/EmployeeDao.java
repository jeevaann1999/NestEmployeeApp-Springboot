package com.example.nestemployeeapp_backend.dao;

import com.example.nestemployeeapp_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
