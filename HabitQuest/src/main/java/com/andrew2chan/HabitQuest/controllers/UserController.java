package com.andrew2chan.HabitQuest.controllers;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.mappers.CreateMapper;
import com.andrew2chan.HabitQuest.mappers.Mapper;
import com.andrew2chan.HabitQuest.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;
    private CreateMapper<CreateUsersDTO, Users> createMapper;
    private Mapper<Users, UsersDTO> mapper;

    public UserController(UserService userService, CreateMapper<CreateUsersDTO, Users> createMapper, Mapper<Users, UsersDTO> mapper) {
        this.userService = userService;
        this.createMapper = createMapper;
        this.mapper = mapper;
    }

    @PostMapping(path = "/user")
    public ResponseEntity<UsersDTO> createUser(@RequestBody CreateUsersDTO createUsersDTO) {
        Users newUserEntity = createMapper.mapCreateUsersDTOToEntity(createUsersDTO);
        Users savedUser = userService.createUser(newUserEntity);
        UsersDTO userDTOToReturn = mapper.mapEntityToDTO(savedUser);

        return new ResponseEntity<>(userDTOToReturn, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
