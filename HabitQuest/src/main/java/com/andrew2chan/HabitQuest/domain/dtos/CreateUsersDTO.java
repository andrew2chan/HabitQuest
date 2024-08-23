package com.andrew2chan.HabitQuest.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUsersDTO {
    public String emailAddress;
    public String password;
    public String name;
}
