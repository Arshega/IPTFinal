package com.example.iptfinal.controller;


import com.example.iptfinal.entity.User;

import com.example.iptfinal.response.UserListResponse;

import com.example.iptfinal.response.SystemResponse;

import com.example.iptfinal.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/addUser",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse addUser(
            @RequestBody User user
    ) {
        userService.saveUser(user);
        return new SystemResponse(true, user.getFirstname() + " is added successfully.");
    }


    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SystemResponse login(
            @RequestBody User user){
        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(userService.login(user));
        if(systemResponse.isFlag()){
            systemResponse.setMessage(user.getUsername()+" is logged in successfully.");
        }else{
            systemResponse.setMessage("wrong username or password");
        }
        return systemResponse;
    }

    @RequestMapping(value = "/userList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public UserListResponse getUser(){
        UserListResponse clr = new UserListResponse();
        //fetching all customers found on the database.
        clr.setUser(userService.getUsers());
        SystemResponse systemResponse = new SystemResponse(true,"Fetching all the Users are successful.");
        clr.setSystemResponse(systemResponse);
        return clr;
    }

}
