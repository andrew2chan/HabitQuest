package com.andrew2chan.HabitQuest.services;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;

public interface UserService {
    public Users createUser(Users user);
}
