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
@Table(name = "gamifications")
public class Gamifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public long xp = 0;

    @OneToMany(mappedBy = "gamifications")
    public List<GamificationsBadges> gamificationsBadges;

    @OneToOne
    @JoinColumn(name = "user_id")
    public Users user;
}
