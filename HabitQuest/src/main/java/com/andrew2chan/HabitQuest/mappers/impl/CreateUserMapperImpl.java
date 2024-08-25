package com.andrew2chan.HabitQuest.mappers.impl;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.mappers.CreateMapper;
import com.andrew2chan.HabitQuest.services.SecurityService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
public class CreateUserMapperImpl implements CreateMapper<CreateUsersDTO, Users> {
    private ModelMapper mapper;
    private SecurityService securityService;

    public CreateUserMapperImpl(ModelMapper mapper, SecurityService securityService) {
        this.mapper = mapper;
        this.securityService = securityService;
    }

    @Override
    public Users mapCreateUsersDTOToEntity(CreateUsersDTO createUsersDTO) {
        TypeMap<CreateUsersDTO, Users> propertyMapper = mapper.createTypeMap(CreateUsersDTO.class, Users.class);
        propertyMapper.addMappings(mapper -> {
            mapper.using(ctx -> securityService.hashPassword((String)ctx.getSource())).map(CreateUsersDTO::getPassword, Users::setHashedPassword); //using the converter to convert to a hashed password and then mapping it
        });

        return mapper.map(createUsersDTO, Users.class);
    }
}
