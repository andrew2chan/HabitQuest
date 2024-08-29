package com.andrew2chan.HabitQuest.services.impl;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.repositories.UserRepository;
import com.andrew2chan.HabitQuest.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
    }

    @Override
    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
