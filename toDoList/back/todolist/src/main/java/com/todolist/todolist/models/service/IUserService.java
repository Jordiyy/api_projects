package com.todolist.todolist.models.service;

import com.todolist.todolist.models.entity.User;

public interface IUserService {
    public User save(User user);

    public User get(User user);
    
    public User change(User user);

    public void delete(User user);
}
