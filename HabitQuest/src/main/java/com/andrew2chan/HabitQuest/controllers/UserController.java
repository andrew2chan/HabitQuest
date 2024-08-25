package com.andrew2chan.HabitQuest.controllers;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.mappers.CreateMapper;
import com.andrew2chan.HabitQuest.mappers.Mapper;
import com.andrew2chan.HabitQuest.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping(path = "/createuser")
    public ResponseEntity<UsersDTO> createUser(@RequestBody CreateUsersDTO createUsersDTO) {
        System.out.println(createUsersDTO);
        Users newUserEntity = createMapper.mapCreateUsersDTOToEntity(createUsersDTO);
        Users savedUser = userService.createUser(newUserEntity);
        UsersDTO userDTOToReturn = mapper.mapEntityToDTO(savedUser);

        return new ResponseEntity<>(userDTOToReturn, HttpStatus.CREATED);
    }
}
