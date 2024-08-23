package com.andrew2chan.HabitQuest.controllers;

import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.repositories.UserRepository;
import com.andrew2chan.HabitQuest.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/createuser")
    public UsersDTO createUser(@RequestBody CreateUsersDTO createUsersDTO) {
        return null;
    }
}
