package com.example.iptfinal.service;

import com.example.iptfinal.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void saveUser(User user);
    boolean login(User user);
}
