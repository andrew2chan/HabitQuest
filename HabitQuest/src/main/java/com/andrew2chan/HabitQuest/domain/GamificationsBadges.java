package com.andrew2chan.HabitQuest.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "gamifications_badges")
public class GamificationsBadges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "gamifications_id")
    public Gamifications gamifications;

    @ManyToOne
    @JoinColumn(name = "badges_id")
    public Badges badges;

    public boolean badgeAchieved = false;
}
