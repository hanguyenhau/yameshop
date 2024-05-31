package com.yameshopbe.controller;

import com.yameshopbe.entity.User;
import com.yameshopbe.service.UserService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin(){
        return "this URL is only accessible to admin";
    }

    @GetMapping({"/forUser"})
    public String forUser(){
        return "this URL is only accessible to admin";
    }
}
