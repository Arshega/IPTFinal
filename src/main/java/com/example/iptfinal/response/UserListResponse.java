package com.example.iptfinal.response;

import com.example.iptfinal.entity.User;

import java.util.List;

public class UserListResponse {
    private SystemResponse systemResponse;

    private List<User> user;

    public UserListResponse() {
    }

    public UserListResponse(SystemResponse systemResponse, List<User> customers) {
        this.systemResponse = systemResponse;
        this.user = customers;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<User> getUsers() {
        return user;
    }

    public void setUser(List<User> users) {
        this.user = users;
    }
}
