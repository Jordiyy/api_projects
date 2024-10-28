package com.todolist.todolist.models.service;

import java.util.List;

import com.todolist.todolist.models.entity.Task;
import com.todolist.todolist.models.entity.User;

public interface ITaskService {
    public List<Task> getAll();

    //public List<Task> findByUser(User user);

    public Task save(Task task);

    public Task findByTaskId(int id);

    public List<Task> findAllTasks();

    public void deleteTaskById(int taskId);
}
