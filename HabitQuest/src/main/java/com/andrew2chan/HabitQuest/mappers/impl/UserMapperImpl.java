package com.andrew2chan.HabitQuest.mappers.impl;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.mappers.Mapper;
import com.andrew2chan.HabitQuest.services.SecurityService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements Mapper<Users, UsersDTO> {
    private ModelMapper mapper;

    public UserMapperImpl(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UsersDTO mapEntityToDTO(Users users) {
        TypeMap<Users, UsersDTO> propertyMapper = mapper.createTypeMap(Users.class, UsersDTO.class);
        propertyMapper.addMappings(mapper -> mapper.skip(UsersDTO::setHashedPassword)); //skip setting the hashed password

        return mapper.map(users, UsersDTO.class);
    }

    @Override
    public Users mapDTOToEntity(UsersDTO usersDTO) {
        return mapper.map(usersDTO, Users.class);
    }
}
