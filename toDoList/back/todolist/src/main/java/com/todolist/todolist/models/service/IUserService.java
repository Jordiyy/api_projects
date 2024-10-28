package com.todolist.todolist.models.service;

import com.todolist.todolist.models.entity.User;

public interface IUserService {
    public User save(User user);

    public User findUserById(int id);
    
    public User update(User user);

    public void deleteUser(int id);
}
