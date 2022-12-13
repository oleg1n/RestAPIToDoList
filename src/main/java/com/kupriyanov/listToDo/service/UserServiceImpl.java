package com.kupriyanov.listToDo.service;

import com.kupriyanov.listToDo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void create(User user) {

    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public User read(long id) {
        return null;
    }

    @Override
    public boolean update(User user, long id) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
