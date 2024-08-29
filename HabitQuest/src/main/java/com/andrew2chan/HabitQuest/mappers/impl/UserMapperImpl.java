package com.andrew2chan.HabitQuest.mappers.impl;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements Mapper<Users, UsersDTO> {
    private ModelMapper mapper;

    public UserMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UsersDTO mapEntityToDTO(Users users) {
        return mapper.map(users, UsersDTO.class);
    }

    @Override
    public Users mapDTOToEntity(UsersDTO usersDTO) {
        return mapper.map(usersDTO, Users.class);
    }
}
