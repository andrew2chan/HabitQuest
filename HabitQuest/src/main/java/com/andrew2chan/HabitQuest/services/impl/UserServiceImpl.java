package com.andrew2chan.HabitQuest.services.impl;

import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.repositories.UserRepository;
import com.andrew2chan.HabitQuest.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CreateUsersDTO createUser(CreateUsersDTO user) {
        return null;
    }
}
