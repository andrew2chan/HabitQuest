package com.andrew2chan.HabitQuest.config;

import com.andrew2chan.HabitQuest.domain.Users;
import com.andrew2chan.HabitQuest.domain.dtos.CreateUsersDTO;
import com.andrew2chan.HabitQuest.domain.dtos.UsersDTO;
import com.andrew2chan.HabitQuest.services.SecurityService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    private SecurityService securityService;

    public MapperConfig(SecurityService securityService) {
        this.securityService = securityService;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMap = new ModelMapper();

        TypeMap<Users, UsersDTO> userToUserDTOMapper = modelMap.createTypeMap(Users.class, UsersDTO.class);
        userToUserDTOMapper.addMappings(mapper -> mapper.skip(UsersDTO::setHashedPassword)); //skip setting the hashed password

        TypeMap<CreateUsersDTO, Users> createUsersDTOToUsersMapper = modelMap.createTypeMap(CreateUsersDTO.class, Users.class);
        createUsersDTOToUsersMapper.addMappings(mapper -> {
            mapper.using(ctx -> securityService.hashPassword((String)ctx.getSource())).map(CreateUsersDTO::getPassword, Users::setHashedPassword); //using the converter to convert to a hashed password and then mapping it
        });

        return modelMap;
    }
}
