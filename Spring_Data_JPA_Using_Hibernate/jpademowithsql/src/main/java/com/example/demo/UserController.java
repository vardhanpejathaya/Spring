package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/save")
    public User saveData() {
        User user = new User();
        user.setId(2);
        user.setName("vardhan");
        return userRepo.save(user);
    }

}
