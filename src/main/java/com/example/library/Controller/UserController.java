package com.example.library.Controller;

import com.example.library.Entity.User;
import com.example.library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findall();
    }
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
