package com.andrew2chan.HabitQuest.services;

import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;

public interface UserService {
    public CreateUsersDTO createUser(CreateUsersDTO user);
}
