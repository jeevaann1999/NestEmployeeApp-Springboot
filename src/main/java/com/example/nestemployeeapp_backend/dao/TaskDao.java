package com.example.nestemployeeapp_backend.dao;

import com.example.nestemployeeapp_backend.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface TaskDao extends CrudRepository<Task,Integer> {

    @Query(value = "SELECT e.`company`, e.`designation`, e.`empcode`, e.`empname`, e.`mobile`,  e.`username`,t.task,t.status FROM `employee` e JOIN task t ON e.empcode=t.empcode",nativeQuery = true)
    List<Map<String,String>> ViewAllTask();


    @Query(value = "SELECT `id`, `empcode`, `status`, `task` FROM `task` WHERE `empcode`= :empcode",nativeQuery = true)
    List<Task> EmployViewTask(@Param("empcode") Integer empcode);
}
