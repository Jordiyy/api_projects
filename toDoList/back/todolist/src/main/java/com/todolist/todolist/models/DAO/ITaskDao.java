package com.todolist.todolist.models.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.todolist.todolist.models.entity.Task;

public interface ITaskDao extends CrudRepository<Task, Integer>{
    //List<Task> findByUserId(int id);
}
