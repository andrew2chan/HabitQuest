package com.andrew2chan.HabitQuest.domain.dtos;

import com.andrew2chan.HabitQuest.domain.Gamifications;
import com.andrew2chan.HabitQuest.domain.Habits;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersDTO {
    public Long id;

    public String emailAddress;
    public String hashedPassword;
    public String name;
    public long streak = 0;
    public Date last_streak;

    public List<Habits> habits = new ArrayList<>();

    public Gamifications gamification;
}
