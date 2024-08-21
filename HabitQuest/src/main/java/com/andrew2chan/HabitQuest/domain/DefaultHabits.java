package com.andrew2chan.HabitQuest.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "defaulthabits")
public class DefaultHabits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String description;
    public boolean status;

    @ManyToMany
    @JoinTable(
            name = "defaulthabits_users",
            joinColumns = @JoinColumn(name = "defaulthabits_id"),
            inverseJoinColumns = @JoinColumn(name = "users_id")
    )
    public List<Users> users = new ArrayList<>();
}
