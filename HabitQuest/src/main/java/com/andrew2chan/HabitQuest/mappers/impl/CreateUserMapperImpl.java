package com.andrew2chan.HabitQuest.mappers.impl;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.mappers.CreateMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateUserMapperImpl implements CreateMapper<CreateUsersDTO, Users> {
    private ModelMapper mapper;

    public CreateUserMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Users mapCreateUsersDTOToEntity(CreateUsersDTO createUsersDTO) {
        return mapper.map(createUsersDTO, Users.class);
    }
}
