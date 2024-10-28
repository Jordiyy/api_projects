package com.todolist.todolist.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.todolist.models.DAO.IUserDao;
import com.todolist.todolist.models.entity.User;

@Service
public class UserServiceImp implements IUserService{

    @Autowired
    private IUserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findById(id).orElse(null);
    }

    public List<User> getAllUser() {
        return (List<User>)userDao.findAll();
    }

    @Override
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }
    
}
