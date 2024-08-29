package com.andrew2chan.HabitQuest.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "badges")
public class Badges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String description;
    public Long levelReached;
    public Long streakDays;

    @ManyToMany
    @JoinTable(
            name = "gamifications_badges",
            joinColumns = @JoinColumn(name = "badges_id"),
            inverseJoinColumns = @JoinColumn(name = "gamifications_id")
    )
    public List<Gamifications> gamifications;
}
