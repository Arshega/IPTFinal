package com.example.iptfinal.dao;

import com.example.iptfinal.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getUser();
    void saveUser(User user);

    boolean loginUser(User user);
}
