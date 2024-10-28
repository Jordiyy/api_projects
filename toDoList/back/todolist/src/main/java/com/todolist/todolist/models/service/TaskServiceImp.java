package com.todolist.todolist.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.todolist.models.DAO.ITaskDao;
import com.todolist.todolist.models.entity.Task;
import com.todolist.todolist.models.entity.User;

@Service
public class TaskServiceImp implements ITaskService{

    @Autowired
    private ITaskDao taskDao;

    @Override
    public void delete(int taskId) {
        taskDao.deleteById(taskId);
    }

    @Override
    public Task findByTaskId(int id) {
        return taskDao.findById(id).orElse(null);
    }

    /*@Override
    public List<Task> findByUser(User user) {
        return taskDao.findByUserId(user.getId());
    }*/

    @Override
    public List<Task> getAll() {
        return (List<Task>)taskDao.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskDao.save(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return (List<Task>)taskDao.findAll();
    }
    
}
