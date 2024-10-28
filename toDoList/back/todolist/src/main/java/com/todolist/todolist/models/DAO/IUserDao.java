package com.todolist.todolist.models.DAO;

import org.springframework.data.repository.CrudRepository;

import com.todolist.todolist.models.entity.User;

public interface IUserDao extends CrudRepository<User, Integer>{
    
}
