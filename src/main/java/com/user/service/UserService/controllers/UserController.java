package com.user.service.UserService.controllers;

import com.user.service.UserService.entities.User;
import com.user.service.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
       User user1= userService.saveUser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping("/{userId}")
    ResponseEntity<User> getUser(@PathVariable String userId){
        User user= userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
    @GetMapping
    ResponseEntity<List<User>> getAllUser(){
        List<User> getAllUser=userService.getAllUser();
        return ResponseEntity.ok(getAllUser);

    }



}
