package com.example.feignclientDemo.controller;

import com.example.feignclientDemo.client.UserClient;
import com.example.feignclientDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class UserController {
    @Autowired
    private UserClient userClient;

    @PostMapping("/add")
    public ResponseEntity<User> add(User user){
        user.setName("lkjh");
        user.setId(99);
        userClient.add(user);
        return ResponseEntity.ok(user);
    }
}
