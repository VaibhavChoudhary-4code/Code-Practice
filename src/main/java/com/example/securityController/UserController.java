package com.example.securityController;

import com.example.securityService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.securityModels.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUser(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }



 }
